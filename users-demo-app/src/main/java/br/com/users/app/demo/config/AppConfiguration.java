package br.com.users.app.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.users.app.demo.controller.errorhandler.FeignErrorDecoder;
import feign.codec.ErrorDecoder;

@Configuration
public class AppConfiguration {

	@Bean
	public ErrorDecoder errorDecoder() {
		return new FeignErrorDecoder();
	}
}
