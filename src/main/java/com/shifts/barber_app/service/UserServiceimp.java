package com.shifts.barber_app.service;

import com.shifts.barber_app.DTO.UserRegisterDTO;
import com.shifts.barber_app.model.Rol;
import com.shifts.barber_app.model.User;
import com.shifts.barber_app.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;


@Service
public class UserServiceimp implements UserService{

    private UserRepository userRepository;
    public UserServiceimp(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(UserRegisterDTO loginDTO) {
        Collection<Rol> roles = (loginDTO.getRol() != null) ? loginDTO.getRol() : Collections.emptyList();
        User user = new User(loginDTO.getNombre(),loginDTO.getApellido(),loginDTO.getEmail(), loginDTO.getPassword(), roles);
        return userRepository.save(user);
    }
}
