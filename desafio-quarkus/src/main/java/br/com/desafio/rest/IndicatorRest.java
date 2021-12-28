package br.com.desafio.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.jboss.resteasy.annotations.jaxrs.QueryParam;

import br.com.desafio.dtos.ResponseDTO;
import br.com.desafio.services.IndicatorService;

@Path("/indicator")
public class IndicatorRest {
	// http://localhost:8080/q/swagger-ui
	
	@Inject
	IndicatorService indicatorService;
	
	@GET
	public ResponseDTO list(@QueryParam String code) {
		return indicatorService.list(code);
	}
	
}
