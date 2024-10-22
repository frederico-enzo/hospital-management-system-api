package com.hospital.management_system.service;

import com.hospital.management_system.dto.ProntuarioDto;
import com.hospital.management_system.dto.RelatorioDto;
import com.hospital.management_system.model.Relatorio;
import com.hospital.management_system.repository.RelatorioRepository;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelatorioService {
    @Autowired
    private RelatorioRepository repository;
    @Autowired
    private ModelMapper modelMapper;

    private Relatorio toModel(RelatorioDto relatorioDto){
        return modelMapper.map(relatorioDto, Relatorio.class);
    }
    private RelatorioDto toDTO(Relatorio relatorio){
        return modelMapper.map(relatorio, RelatorioDto.class);
    }

    //    ---------------------    CRUD METODOS    ---------------------

    public List<RelatorioDto> findAll(){
        return repository.findAll().stream().map(this::toDTO).toList();
    }

    public RelatorioDto findById(Long id) {
        return repository.findById(id)
                .map(this::toDTO)
                .orElseThrow(() -> new EntityNotFoundException("Agenda não encontrado com o ID: " + id));
    }

    public RelatorioDto post(RelatorioDto model){
        return toDTO(repository.save(toModel(model)));
    }

    public RelatorioDto put(RelatorioDto model, Long id){
        return toDTO(repository.save(toModel(model)));
    }

    public void delete(Long id){ repository.deleteById(id); }


    //    ---------------------    CRUD METODOS    ---------------------

}
