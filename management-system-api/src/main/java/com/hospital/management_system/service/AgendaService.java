package com.hospital.management_system.service;

import com.hospital.management_system.dto.AgendaDto;
import com.hospital.management_system.dto.ConsultaDto;
import com.hospital.management_system.model.Agenda;
import com.hospital.management_system.repository.AgendaRepository;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    //    ---------------------    CRUD METODOS    ---------------------

    public List<AgendaDto> findAll(){
        return repository.findAll().stream().map(this::toDTO).toList();
    }

    public AgendaDto findById(Long id) {
        return repository.findById(id)
                .map(this::toDTO)
                .orElseThrow(() -> new EntityNotFoundException("Agenda não encontrado com o ID: " + id));
    }

    public AgendaDto post(AgendaDto model){
        return toDTO(repository.save(toModel(model)));
    }

    public AgendaDto put(AgendaDto model, Long id){
        return toDTO(repository.save(toModel(model)));
    }

    public void delete(Long id){ repository.deleteById(id); }


    //    ---------------------    CRUD METODOS    ---------------------

}
