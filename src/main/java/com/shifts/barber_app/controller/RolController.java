package com.shifts.barber_app.controller;

import com.shifts.barber_app.DTO.RolDTO;
import com.shifts.barber_app.mapper.RolDTOtoRol;
import com.shifts.barber_app.model.Rol;
import com.shifts.barber_app.service.RolServiceimp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/rol")
public class RolController {

    private final RolServiceimp rolServiceimp;


    public RolController (RolServiceimp rolServiceimp ){
        this.rolServiceimp = rolServiceimp;
    }

    @GetMapping
    public List<Rol> getRols(){
        return rolServiceimp.showRols();
    }

    @PostMapping
    public Rol saveRol(@RequestBody Map<String,String> body){
        RolDTO newRol = new RolDTO(body.get("name")) ;
        return rolServiceimp.rolSave(newRol);
    }
}
