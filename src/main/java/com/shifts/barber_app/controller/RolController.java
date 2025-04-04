package com.shifts.barber_app.controller;

import com.shifts.barber_app.DTO.RolDTO;
import com.shifts.barber_app.model.Rol;
import com.shifts.barber_app.service.RolServiceimp;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
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
    @DeleteMapping("id")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        this.rolServiceimp.deleteById(id);
        return ResponseEntity.noContent().build();
    };
    @PatchMapping("update_rol/{id}/{password}")
    public ResponseEntity<Void> update(@PathVariable Long id , @PathVariable String password){
        this.rolServiceimp.updateRol(id, password);
        return ResponseEntity.noContent().build();
    };
}
