package com.shifts.barber_app.service;

import com.shifts.barber_app.DTO.UserRegisterDTO;
import com.shifts.barber_app.model.User;

import java.util.List;

public interface UserService {

    public User saveUser(UserRegisterDTO loginDTO);
    public List<User> showUsers();
    public void updateName(long id , String name);
    public void updateApellido(long id , String apellido);
    public void updatePassword(long id , String password);
    public void deleteById(long id);
}
