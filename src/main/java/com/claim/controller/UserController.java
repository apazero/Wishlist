package com.claim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.claim.entity.User;
import com.claim.service.UserService;

@CrossOrigin
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

//	@RequestMapping(value="/login", method=RequestMethod.POST)
//	public ModelAndView login(@ModelAttribute("user") User user, HttpSession session) {
//		User myUser = userService.loginUser(user.getEmail(), user.getPassword());
//		
//		if(myUser != null)
//		{
//			session.setAttribute("loggedInUser", myUser);
//			return new ModelAndView("profile");
//		}
//		else
//			return new ModelAndView("login", "user", new User());
//	}
	
	@RequestMapping(value="/userLogin",  
			 consumes=MediaType.APPLICATION_JSON_VALUE,
			 produces=MediaType.APPLICATION_JSON_VALUE, 
			 method= RequestMethod.POST ) 
	 private ResponseEntity<User> loginUser(@RequestBody User user){ 
		 User foundUser = userService.loginUser(user.getEmail(), user.getPassword());  //repo.findOne(student.getEmail());
		 if(foundUser != null) {
			 return new ResponseEntity<>(foundUser, HttpStatus.OK);
		 }
		 else {
			 return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		 }
		 
	 }
}
