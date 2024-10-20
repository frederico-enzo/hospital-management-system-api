package com.hospital.management_system.service;

import com.hospital.management_system.dto.PacienteDto;
import com.hospital.management_system.model.Paciente;
import com.hospital.management_system.repository.PacienteRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteService{
    @Autowired
    private PacienteRepository repository;
    @Autowired
    private ModelMapper modelMapper;

    private Paciente toModel(PacienteDto pacienteDto){
        return modelMapper.map(pacienteDto, Paciente.class);
    }
    private PacienteDto toDTO(Paciente paciente){
        return modelMapper.map(paciente, PacienteDto.class);
    }

    public PacienteDto create(PacienteDto model){
        return toDTO(repository.save(toModel(model)));
    }
    public PacienteDto update(PacienteDto model){
        return toDTO(repository.save(toModel(model)));
    }



}
