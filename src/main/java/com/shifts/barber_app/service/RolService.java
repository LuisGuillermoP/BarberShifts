package com.shifts.barber_app.service;

import com.shifts.barber_app.DTO.RolDTO;
import com.shifts.barber_app.model.Rol;
import com.shifts.barber_app.model.User;

import java.util.List;


public interface RolService {
    public Rol rolSave(RolDTO rolDTO);
    public List<Rol> showRols();

}
