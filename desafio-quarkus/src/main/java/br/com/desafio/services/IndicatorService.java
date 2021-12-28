package br.com.desafio.services;

import javax.enterprise.context.ApplicationScoped;

import br.com.desafio.dtos.ResponseDTO;
import br.com.desafio.requests.WorldbankRequest;

@ApplicationScoped
public class IndicatorService {
	
	public ResponseDTO list(String code) {
		return WorldbankRequest.getIndicatorsByCountryCode(code);
	} 

}
