package com.hospital.management_system.service;

import com.hospital.management_system.dto.ConsultaDto;
import com.hospital.management_system.dto.RelatorioDto;
import com.hospital.management_system.model.Consulta;
import com.hospital.management_system.repository.ConsultaRepository;
import jakarta.persistence.EntityNotFoundException;
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
    public void delete(Long id){ repository.deleteById(id);}
    public ConsultaDto read(Long id) {
        return repository.findById(id)
                .map(this::toDTO)
                .orElseThrow(() -> new EntityNotFoundException("Consulta não encontrado com o ID: " + id));
    }
}
