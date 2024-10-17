package com.hospital.management_system.service;

import com.hospital.management_system.dto.MedicoDto;
import com.hospital.management_system.dto.ProntuarioDto;
import com.hospital.management_system.model.Medico;
import com.hospital.management_system.model.Prontuario;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProntuarioService {
    @Autowired
    private ModelMapper modelMapper;

    private Prontuario toModel(ProntuarioDto prontuarioDto){
        return modelMapper.map(prontuarioDto, Prontuario.class);
    }
    private ProntuarioDto toDTO(Prontuario prontuario){
        return modelMapper.map(prontuario, ProntuarioDto.class);
    }
}
