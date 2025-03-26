package com.shifts.barber_app.controller;


import com.shifts.barber_app.DTO.UserRegisterDTO;
import com.shifts.barber_app.model.User;
import com.shifts.barber_app.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registration")
public class LoginController {
    private UserService userService ;

    private LoginController(UserService userService) {

        this.userService = userService;
    }

    @GetMapping
    public List<User> showFormRegister(){
        return userService.showUsers();
    };

    @PostMapping
    public String singUo(UserRegisterDTO userRegisterDTO){
        userService.saveUser(userRegisterDTO);
        return "exito";
    };

    @PatchMapping("update_name/{id}/{name}")
    public ResponseEntity<Void> updateUserName(@PathVariable Long id , @PathVariable String name){
        this.userService.updateName(id, name);
        return ResponseEntity.noContent().build();
    };
    @PatchMapping("update_apellido/{id}/{apellido}")
    public ResponseEntity<Void> updateUserApellido(@PathVariable Long id , @PathVariable String apellido){
        this.userService.updateApellido(id, apellido);
        return ResponseEntity.noContent().build();
    };
    @PatchMapping("update_password/{id}/{password}")
    public ResponseEntity<Void> updateUserPassword(@PathVariable Long id , @PathVariable String password){
        this.userService.updatePassword(id, password);
        return ResponseEntity.noContent().build();
    };

    @DeleteMapping("id")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        this.userService.deleteById();
        return ResponseEntity.noContent().build();
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
