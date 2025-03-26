package com.shifts.barber_app.mapper;

import com.shifts.barber_app.DTO.UserRegisterDTO;
import com.shifts.barber_app.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserDTOtoUser implements IMapper<UserRegisterDTO,User>{
    @Override
    public User map(UserRegisterDTO in) {
        User user = new User();
        user.setApellido(in.getApellido());
        user.setEmail(in.getEmail());
        user.setNombre(in.getNombre());
        user.setPassword(in.getPassword());
        return user;
    }
}
