package com.shifts.barber_app.controller;


import com.shifts.barber_app.DTO.UserRegisterDTO;
import com.shifts.barber_app.model.User;
import com.shifts.barber_app.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/registration")
public class LoginController {
    private UserService userService ;

    private LoginController(UserService userService) {

        this.userService = userService;
    }
    @ModelAttribute("Usuario")
    public UserRegisterDTO retunrnNewUserLogDTO (){
        return new UserRegisterDTO();
    };

    @GetMapping
    public List<User> showFormRegister(){
        return userService.showUsers();
    };

    @PostMapping
    public String singUo(@ModelAttribute("Usuario") UserRegisterDTO userRegisterDTO){
        userService.saveUser(userRegisterDTO);
        return "redirect:/registration?exito";
    };

    //crud de rol y user
    //
    //
    //
    //
    //
    //
    //
}
