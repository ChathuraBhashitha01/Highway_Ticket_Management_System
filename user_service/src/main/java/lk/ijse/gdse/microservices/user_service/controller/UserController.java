package lk.ijse.gdse.microservices.user_service.controller;

import lk.ijse.gdse.microservices.user_service.dto.UserDTO;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
@RequestMapping("/api/v1/users")
public class UserController {

    @PostMapping
    public void registerUser(UserDTO userDTO) {

    }

    @PatchMapping
    public void updateUser(UserDTO userDTO) {

    }

}
