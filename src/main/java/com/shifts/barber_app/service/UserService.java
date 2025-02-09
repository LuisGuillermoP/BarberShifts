package com.shifts.barber_app.service;

import com.shifts.barber_app.DTO.UserRegisterDTO;
import com.shifts.barber_app.model.User;

public interface UserService {

    public User saveUser(UserRegisterDTO loginDTO);
}
