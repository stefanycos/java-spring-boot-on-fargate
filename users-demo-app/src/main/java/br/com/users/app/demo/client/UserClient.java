package br.com.users.app.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://reqres.in/api/users", name = "user")
public interface UserClient {

	@GetMapping("/{id}")
	Object read(@PathVariable String id);

	@GetMapping
	Object list();

}
