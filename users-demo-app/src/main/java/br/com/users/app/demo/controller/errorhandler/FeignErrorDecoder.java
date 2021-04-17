package br.com.users.app.demo.controller.errorhandler;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import feign.Response;
import feign.codec.ErrorDecoder;

@Component
public class FeignErrorDecoder implements ErrorDecoder {

	@Override
	public Exception decode(String methodKey, Response response) {

		if (response.status() == 404) {
			return new ResponseStatusException(HttpStatus.valueOf(response.status()), response.reason());
		}
	
		return new Exception(response.reason());

	}

}
