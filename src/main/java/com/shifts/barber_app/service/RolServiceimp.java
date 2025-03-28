package com.shifts.barber_app.service;

import com.shifts.barber_app.DTO.RolDTO;
import com.shifts.barber_app.exception.ToDoExceptions;
import com.shifts.barber_app.mapper.RolDTOtoRol;
import com.shifts.barber_app.model.Rol;
import com.shifts.barber_app.model.User;
import com.shifts.barber_app.repository.RolRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
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

    @Override
    public void updateRol(long id, String name) {
        Optional<Rol> optionalUser =this.rolRepository.findById(id);
        if (optionalUser.isEmpty()){
            throw new ToDoExceptions("User not found" , HttpStatus.NOT_FOUND);
        }
        this.rolRepository.updateRol(id, name);
    }
    }

    public void deleteById(long id){

            Optional<Rol> optionalUser =this.rolRepository.findById(id);
            if (optionalUser.isEmpty()){
                throw new ToDoExceptions("User not found" , HttpStatus.NOT_FOUND);
            }
            this.rolRepository.deleteById(id);
    }
}
