package com.microserviceinter.controller;

import com.microserviceinter.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MicroserviceInterController {


  @GetMapping("/getAllUserDetails")
  public @ResponseBody  List<UserDto> getAllUsers() {
    String uri = "http://localhost:8080/api/users";

    RestTemplate restTemplate = new RestTemplate();
    List<UserDto> result = (List<UserDto>) restTemplate.getForObject(uri, List.class);
    return result;
  }

}
