package com.hospital.management_system.service;

import com.hospital.management_system.dto.AgendaDto;
import com.hospital.management_system.dto.ConsultaDto;
import com.hospital.management_system.model.Agenda;
import com.hospital.management_system.model.Consulta;
import com.hospital.management_system.repository.ConsultaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaService {
    @Autowired
    private ConsultaRepository repository;
    @Autowired
    private ModelMapper modelMapper;

    private Consulta toModel(ConsultaDto consultaDto){
        return modelMapper.map(consultaDto, Consulta.class);
    }
    private ConsultaDto toDTO(Consulta consulta){
        return modelMapper.map(consulta, ConsultaDto.class);
    }
    public ConsultaDto create(ConsultaDto model){
        return toDTO(repository.save(toModel(model)));
    }
    public ConsultaDto update(ConsultaDto model){
        return toDTO(repository.save(toModel(model)));
    }
}
