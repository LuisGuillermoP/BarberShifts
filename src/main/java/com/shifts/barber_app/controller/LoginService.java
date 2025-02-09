package com.shifts.barber_app.controller;


import com.shifts.barber_app.DTO.UserRegisterDTO;
import com.shifts.barber_app.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class LoginService {
    private UserService userService ;

    public LoginService(UserService userService) {
        this.userService = userService;
    }
    @ModelAttribute("Usuario")
    public UserRegisterDTO retunrnNewUserLogDTO (){
        return new UserRegisterDTO();
    };
}
