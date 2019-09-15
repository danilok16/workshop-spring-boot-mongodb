package com.projeto.workshopmongo.user.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.workshopmongo.user.domain.User;
import com.projeto.workshopmongo.user.dto.UserDTO;
import com.projeto.workshopmongo.user.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity <List<UserDTO>> findAll(){
		List<UserDTO> userListDto = userService.findAll().stream().map(x-> new UserDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(userListDto);
	}

}
