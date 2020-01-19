package com.mt4e.dev.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  Logger log = LoggerFactory.getLogger(UserController.class);
  

  @GetMapping(produces = "application/json")
  @RequestMapping({"/user/authenticate"})
  public UserDto authenticate(){
	  this.log.info("user: {}, password: {}");
    return new UserDto("user", "pass");
  }
}
