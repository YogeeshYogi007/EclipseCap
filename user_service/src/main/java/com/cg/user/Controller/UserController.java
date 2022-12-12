package com.cg.user.Controller;

import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.user.Contact;
import com.cg.user.User;
import com.cg.user.Service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	public UserService userService;
	
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") Long userId) {
		User user= this.userService.getUser(userId);
		//http://localhost:8080/contacts/user/
		List contacts= this.restTemplate.getForObject("http://localhost:8080/contacts/user/"+user.getUserid(),List.class);
		user.setContacts((java.util.List<Contact>) contacts);
		return user;
	}
	

}
