package br.com.desafio.dtos;

import java.util.List;

public class ResponseDTO {
	
	private HeaderDTO headerDTO;
	private List<DataDTO> dataDTO;
	
	
	public ResponseDTO() {}

	public ResponseDTO(HeaderDTO headerDTO, List<DataDTO> dataDTO) {
		super();
		this.headerDTO = headerDTO;
		this.dataDTO = dataDTO;
	}
	

	public HeaderDTO getHeaderDTO() {
		return headerDTO;
	}

	public void setHeaderDTO(HeaderDTO headerDTO) {
		this.headerDTO = headerDTO;
	}

	public List<DataDTO> getDataDTO() {
		return dataDTO;
	}

	public void setDataDTO(List<DataDTO> dataDTO) {
		this.dataDTO = dataDTO;
	}
	
}
