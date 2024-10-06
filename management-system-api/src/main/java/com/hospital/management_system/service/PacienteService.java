package com.hospital.management_system.service;

import com.hospital.management_system.dto.PacienteDto;
import com.hospital.management_system.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteService{
    @Autowired
    private PacienteRepository repository;

    public String get(Long id){
        return "Sucesso";
    }
    public String post(PacienteDto pacienteDto){
        return "Sucesso";
    }
    public String update(PacienteDto pacienteDto, Long id){
        return "Sucesso";
    }
    public String delete(Long id){
        return "Sucesso";
    }

}
