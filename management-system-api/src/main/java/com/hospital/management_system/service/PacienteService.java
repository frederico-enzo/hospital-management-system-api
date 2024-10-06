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


    public String get(Long id){
        return "Sucesso";
    }
    public PacienteDto post(PacienteDto pacienteDto){
        return toDTO(repository.save(toModel(pacienteDto)));
    }
    public String update(PacienteDto pacienteDto, Long id){
        return "Sucesso";
    }
    public String delete(Long id){
        return "Sucesso";
    }

}
