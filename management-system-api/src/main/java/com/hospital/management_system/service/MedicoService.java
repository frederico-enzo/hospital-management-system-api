package com.hospital.management_system.service;

import com.hospital.management_system.dto.ConsultaDto;
import com.hospital.management_system.dto.MedicoDto;
import com.hospital.management_system.dto.RelatorioDto;
import com.hospital.management_system.model.Medico;
import com.hospital.management_system.repository.MedicoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    //    ---------------------    CRUD METODOS    ---------------------

    public List<MedicoDto> findAll(){
        return repository.findAll().stream().map(this::toDTO).toList();
    }

    public MedicoDto findById(Long id) {
        return repository.findById(id)
                .map(this::toDTO)
                .orElseThrow(() -> new EntityNotFoundException("Agenda não encontrado com o ID: " + id));
    }

    public MedicoDto post(MedicoDto model){
        return toDTO(repository.save(toModel(model)));
    }

    public MedicoDto put(MedicoDto model, Long id){
        return toDTO(repository.save(toModel(model)));
    }

    public void delete(Long id){ repository.deleteById(id); }


    //    ---------------------    CRUD METODOS    ---------------------
}
