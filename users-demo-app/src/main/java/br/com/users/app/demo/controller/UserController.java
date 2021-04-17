package br.com.users.app.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.users.app.demo.client.UserClient;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RequestMapping("/v1/users")
@RestController
public class UserController {

	public final UserClient userClient;

	@GetMapping("/{id}")
	public Object read(@PathVariable String id) {
		return userClient.read(id);
	}

	@GetMapping
	public Object list() {
		return userClient.list();
	}

}
