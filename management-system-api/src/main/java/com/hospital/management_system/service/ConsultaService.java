package com.hospital.management_system.service;

import com.hospital.management_system.dto.AgendaDto;
import com.hospital.management_system.dto.ConsultaDto;
import com.hospital.management_system.dto.RelatorioDto;
import com.hospital.management_system.model.Consulta;
import com.hospital.management_system.repository.ConsultaRepository;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    //    ---------------------    CRUD METODOS    ---------------------

    public List<ConsultaDto> findAll(){
        return repository.findAll().stream().map(this::toDTO).toList();
    }

    public ConsultaDto findById(Long id) {
        return repository.findById(id)
                .map(this::toDTO)
                .orElseThrow(() -> new EntityNotFoundException("Agenda não encontrado com o ID: " + id));
    }

    public ConsultaDto post(ConsultaDto model){
        return toDTO(repository.save(toModel(model)));
    }

    public ConsultaDto put(ConsultaDto model, Long id){
        return toDTO(repository.save(toModel(model)));
    }

    public void delete(Long id){ repository.deleteById(id); }


    //    ---------------------    CRUD METODOS    ---------------------

}
