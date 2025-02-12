package com.shifts.barber_app.service;

import com.shifts.barber_app.DTO.UserRegisterDTO;
import com.shifts.barber_app.model.User;

import java.util.List;

public interface UserService {

    public User saveUser(UserRegisterDTO loginDTO);
    public List<User> showUsers();
}
