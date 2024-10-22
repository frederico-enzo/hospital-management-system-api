package com.hospital.management_system.service;

import com.hospital.management_system.dto.AgendaDto;
import com.hospital.management_system.dto.ConsultaDto;
import com.hospital.management_system.model.Agenda;
import com.hospital.management_system.repository.AgendaRepository;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgendaService {
    @Autowired
    private AgendaRepository repository;
    @Autowired
    private ModelMapper modelMapper;

    private Agenda toModel(AgendaDto agendaDto){
        return modelMapper.map(agendaDto, Agenda.class);
    }
    private AgendaDto toDTO(Agenda agenda){
        return modelMapper.map(agenda, AgendaDto.class);
    }

    public AgendaDto create(AgendaDto model){
        return toDTO(repository.save(toModel(model)));
    }
    public AgendaDto update(AgendaDto model){
        return toDTO(repository.save(toModel(model)));
    }
    public void delete(Long id){ repository.deleteById(id);}
    public AgendaDto read(Long id) {
        return repository.findById(id)
                .map(this::toDTO)
                .orElseThrow(() -> new EntityNotFoundException("Agenda não encontrado com o ID: " + id));
    }
}
