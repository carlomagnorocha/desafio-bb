package br.com.desafio.requests;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import br.com.desafio.dtos.DataDTO;
import br.com.desafio.dtos.HeaderDTO;
import br.com.desafio.dtos.ResponseDTO;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;


public class WorldbankRequest {
	
	public static final String URL_PART1 = "http://api.worldbank.org/v2/country/";
	public static final String URL_PART2 = "/indicator/SI.POV.DDAY?format=json";
	
	public static final ResponseDTO getIndicatorsByCountryCode(String countryCode) {
		JsonArray json = new JsonArray();
		ResponseDTO responseDTO = new ResponseDTO();
		
		try {
			URL url = new URL(URL_PART1 + countryCode + URL_PART2);
			
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");

			int status = con.getResponseCode();
			
			if(status == 200) {
				BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
				String inputLine;
				StringBuffer content = new StringBuffer();
				while ((inputLine = in.readLine()) != null) {
				    content.append(inputLine);
				}
				in.close();
				con.disconnect();
				
				json = new JsonArray(content.toString());
				
				JsonObject header = json.getJsonObject(0);
				HeaderDTO headerDTO = new HeaderDTO();
				headerDTO.setPage(header.getInteger("page"));
				headerDTO.setPages(header.getInteger("pages"));
				headerDTO.setPer_page(header.getInteger("per_page"));
				headerDTO.setTotal(header.getInteger("total"));
				
				responseDTO.setHeaderDTO(headerDTO);
				
				if(headerDTO.getPage() != null) {
					JsonArray data = json.getJsonArray(1);
					List<DataDTO> dataDTOList = new ArrayList<DataDTO>();
					for (int i=0; i < data.size(); i++) {
						JsonObject item = data.getJsonObject(i);
						JsonObject country = item.getJsonObject("country");
						
						DataDTO dataDTO = new DataDTO();
						dataDTO.setCountryId(country.getString("id"));
						dataDTO.setCountryValue(country.getString("value"));
						
						dataDTO.setCountryiso3code(item.getString("countryiso3code"));
						dataDTO.setDate(item.getString("date"));
						dataDTO.setValue(item.getDouble("value"));
						
						dataDTOList.add(dataDTO);
					}
					
					responseDTO.setDataDTO(dataDTOList);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return responseDTO;
		
	}

}
