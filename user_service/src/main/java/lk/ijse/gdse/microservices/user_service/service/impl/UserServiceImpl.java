package lk.ijse.gdse.microservices.user_service.service.impl;

import lk.ijse.gdse.microservices.user_service.dto.UserDTO;
import lk.ijse.gdse.microservices.user_service.entity.User;
import lk.ijse.gdse.microservices.user_service.repo.UserRepo;
import lk.ijse.gdse.microservices.user_service.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private ModelMapper modelMapper;
    private UserRepo userRepo;

    public UserServiceImpl(ModelMapper modelMapper, UserRepo userRepo) {
        this.modelMapper = modelMapper;
        this.userRepo = userRepo;
    }

    @Override
    public List<UserDTO> getAllUser() {
        return userRepo.findAll().stream().map(user -> modelMapper.map(user,UserDTO.class)).toList();
    }

    @Override
    public void registerUser(UserDTO userDTO) {
        userRepo.save(modelMapper.map(userDTO, User.class));
    }

    @Override
    public void updateUser(UserDTO userDTO) {
        userRepo.save(modelMapper.map(userDTO, User.class));
    }
}
