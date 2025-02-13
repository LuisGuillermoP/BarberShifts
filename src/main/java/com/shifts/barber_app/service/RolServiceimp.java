package com.shifts.barber_app.service;

import com.shifts.barber_app.DTO.RolDTO;
import com.shifts.barber_app.model.Rol;
import com.shifts.barber_app.repository.RolRepository;

import java.util.List;

public class RolServiceimp implements RolService{

    private RolRepository rolRepository;

    public RolServiceimp (RolRepository rolRepository){
        this.rolRepository = rolRepository;
    }

    @Override
    public Rol rolSave(RolDTO rolDTO) {

        Rol newRol = new Rol( rolDTO.getName());

        return rolRepository.save(newRol);
    }

    @Override
    public List<Rol> showRols(){

        return rolRepository.findAll();
    }
}
