package com.hospital.management_system.service;

import com.hospital.management_system.dto.ConsultaDto;
import com.hospital.management_system.dto.MedicoDto;
import com.hospital.management_system.model.Consulta;
import com.hospital.management_system.model.Medico;
import com.hospital.management_system.repository.MedicoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicoService {
    @Autowired
    private MedicoRepository repository;
    @Autowired
    private ModelMapper modelMapper;
    private Medico toModel(MedicoDto medicoDto){
        return modelMapper.map(medicoDto, Medico.class);
    }
    private MedicoDto toDTO(Medico medico){
        return modelMapper.map(medico, MedicoDto.class);
    }
    public MedicoDto create(MedicoDto medico){
        return toDTO(repository.save(toModel(medico)));
    }
    public MedicoDto update(MedicoDto medico){
        return toDTO(repository.save(toModel(medico)));
    }
}
