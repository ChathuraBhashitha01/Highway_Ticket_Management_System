package lk.ijse.gdse.microservices.user_service.controller;

import lk.ijse.gdse.microservices.user_service.dto.UserDTO;
import lk.ijse.gdse.microservices.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@EnableDiscoveryClient
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDTO> getUsers() {
        return userService.getAllUser();
    }

    @PostMapping
    public void registerUser(UserDTO userDTO) {
        userService.registerUser(userDTO);
    }

    @PatchMapping
    public void updateUser(UserDTO userDTO) {
        userService.updateUser(userDTO);
    }

}