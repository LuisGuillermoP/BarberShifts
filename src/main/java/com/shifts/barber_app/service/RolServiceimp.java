package com.shifts.barber_app.service;

import com.shifts.barber_app.DTO.RolDTO;
import com.shifts.barber_app.mapper.RolDTOtoRol;
import com.shifts.barber_app.model.Rol;
import com.shifts.barber_app.repository.RolRepository;

import java.util.List;

public class RolServiceimp implements RolService{

    private final RolRepository rolRepository;
    private final RolDTOtoRol mapper;
    public RolServiceimp (RolRepository rolRepository, RolDTOtoRol rolDTOtoRol){
        this.rolRepository = rolRepository;
        this.mapper = rolDTOtoRol;

    }

    @Override
    public Rol rolSave(RolDTO rolDTO) {

        Rol rol = mapper.map(rolDTO);

        return rolRepository.save(rol);
    }

    @Override
    public List<Rol> showRols(){

        return rolRepository.findAll();
    }
}
