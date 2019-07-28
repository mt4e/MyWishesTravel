package com.mt4e.dev.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  private UserRepository userRepository;
  Logger log = LoggerFactory.getLogger(UserController.class);
  
  public UserController(UserRepository userRepository){
    this.userRepository = userRepository;
  }

  @CrossOrigin(origins = "http://localhost:4200")
  @RequestMapping(value = "/users/authenticate", method = RequestMethod.POST, params= {"userName", "password"})
  public String authenticate(@RequestParam("userName") final String userName, @RequestParam("password") final String password){
	  this.log.info("user: {}, password: {}", userName, password);
    return "token";
  }
}
