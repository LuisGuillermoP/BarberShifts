package com.shifts.barber_app.mapper;

import com.shifts.barber_app.DTO.RolDTO;
import com.shifts.barber_app.model.Rol;
import org.springframework.stereotype.Component;

@Component
public class RolDTOtoRol implements IMapper<RolDTO , Rol>{

    @Override
    public Rol map(RolDTO in) {
        Rol rol = new Rol();
        rol.setName(in.getName());
        return rol;
    }
}
