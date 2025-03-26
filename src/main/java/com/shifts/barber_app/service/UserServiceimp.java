package com.shifts.barber_app.service;

import com.shifts.barber_app.DTO.UserRegisterDTO;
import com.shifts.barber_app.exception.ToDoExceptions;
import com.shifts.barber_app.mapper.IMapper;
import com.shifts.barber_app.mapper.UserDTOtoUser;
import com.shifts.barber_app.model.User;
import com.shifts.barber_app.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import java.util.*;


@Service

public class UserServiceimp implements UserService{

    private UserRepository userRepository;
    private UserDTOtoUser mapper;
    public UserServiceimp(UserRepository userRepository, UserDTOtoUser userDTOtoUser){
        this.userRepository = userRepository;
        this.mapper = userDTOtoUser;
    }

    @Override
    public User saveUser(UserRegisterDTO loginDTO) {
        User user = mapper.map(loginDTO);
        return userRepository.save(user);
    }

    @Override
    public List<User> showUsers(){
      return userRepository.findAll();
    };

    public void updateName(long id , String name){
        Optional<User> optionalUser =this.userRepository.findById(id);
        if (optionalUser.isEmpty()){
            throw new ToDoExceptions("User not found" , HttpStatus.NOT_FOUND);
        }
        this.userRepository.updateName(id, name);
    }

    public void updateApellido(long id , String apellido){
        Optional<User> optionalUser =this.userRepository.findById(id);
        if (optionalUser.isEmpty()){
            throw new ToDoExceptions("User not found" , HttpStatus.NOT_FOUND);
        }
        this.userRepository.updateApellido(id, apellido);
    }
    public void updatePassword(long id , String password){
        Optional<User> optionalUser =this.userRepository.findById(id);
        if (optionalUser.isEmpty()){
            throw new ToDoExceptions("User not found" , HttpStatus.NOT_FOUND);
        }
        this.userRepository.updatePasword(id, password);
    }

    public void deleteById(long id){
        Optional<User> optionalUser =this.userRepository.findById(id);
        if (optionalUser.isEmpty()){
            throw new ToDoExceptions("User not found" , HttpStatus.NOT_FOUND);
        }
        this.userRepository.deleteById(id);
    }
}
