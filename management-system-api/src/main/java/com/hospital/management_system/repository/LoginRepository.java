package com.hospital.management_system.repository;


import com.hospital.management_system.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoginRepository extends JpaRepository<Usuario, Long> {
    public Optional<Usuario> findByUsername(String login);

}