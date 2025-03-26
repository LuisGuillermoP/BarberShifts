package com.shifts.barber_app.repository;

import com.shifts.barber_app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    @Modifying
    @Transactional
    @Query(value = "UPDATE users SET nombre = :nombre WHERE id = :id ;" , nativeQuery = true)
    public void updateName(@Param("id")Long id , @Param("nombre") String nombre);

    @Modifying
    @Transactional
    @Query(value = "UPDATE users SET apellido = :apellido WHERE id = :id ;" , nativeQuery = true)
    public void updateApellido(@Param("id")Long id , @Param("apellido") String apellido);

    @Modifying
    @Transactional
    @Query(value = "UPDATE users SET password = :password WHERE id = :id ;" , nativeQuery = true)
    public void updatePasword(@Param("id")Long id , @Param("password") String password);
}
