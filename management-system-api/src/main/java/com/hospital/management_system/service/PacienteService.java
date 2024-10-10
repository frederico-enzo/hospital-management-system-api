package com.hospital.management_system.service;

import com.hospital.management_system.dto.PacienteDto;
import com.hospital.management_system.model.Paciente;
import com.hospital.management_system.model.Prontuario;
import com.hospital.management_system.repository.PacienteRepository;
import com.hospital.management_system.repository.ProntuarioRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteService{
    @Autowired
    private PacienteRepository repository;
    @Autowired
    private ProntuarioRepository prontuarioRepository;
    @Autowired
    private ModelMapper modelMapper;

    private Paciente toModel(PacienteDto pacienteDto){
        return modelMapper.map(pacienteDto, Paciente.class);
    }
    private PacienteDto toDTO(Paciente paciente){
        return modelMapper.map(paciente, PacienteDto.class);
    }


    public PacienteDto get(Long id){
        final Paciente paciente = repository.findById(id).orElse(null);
        return toDTO(paciente);
    }
    public PacienteDto post(PacienteDto pacienteDto){
        return toDTO(repository.save(toModel(pacienteDto)));
    }
    public PacienteDto update(PacienteDto pacienteDto, Long id){
        return toDTO(repository.save(toModel(pacienteDto)));
    }
    public void delete(Long id){
        repository.deleteById(id);
    }

}
