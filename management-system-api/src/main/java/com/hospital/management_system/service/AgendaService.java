package com.hospital.management_system.service;

import com.hospital.management_system.dto.AgendaDto;
import com.hospital.management_system.dto.PacienteDto;
import com.hospital.management_system.model.Agenda;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgendaService {
    @Autowired
    private ModelMapper modelMapper;

    private Agenda toModel(AgendaDto agendaDto){
        return modelMapper.map(agendaDto, Agenda.class);
    }
    private AgendaDto toDTO(Agenda agenda){
        return modelMapper.map(agenda, AgendaDto.class);
    }

}
