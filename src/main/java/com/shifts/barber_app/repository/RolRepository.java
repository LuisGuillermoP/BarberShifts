package com.shifts.barber_app.repository;

import com.shifts.barber_app.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {
    @Modifying
    @Transactional
    @Query(value = "UPDATE users SET nombre = :nombre WHERE id = :id ;" , nativeQuery = true)
    public void updateRol(@Param("id")Long id , @Param("nombre") String nombre);

}
