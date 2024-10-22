package com.hospital.management_system.service;

import com.hospital.management_system.dto.PacienteDto;
import com.hospital.management_system.dto.ProntuarioDto;
import com.hospital.management_system.dto.RelatorioDto;
import com.hospital.management_system.model.Prontuario;
import com.hospital.management_system.repository.ProntuarioRepository;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProntuarioService {
    @Autowired
    private ProntuarioRepository repository;
    @Autowired
    private ModelMapper modelMapper;

    private Prontuario toModel(ProntuarioDto prontuarioDto){
        return modelMapper.map(prontuarioDto, Prontuario.class);
    }
    private ProntuarioDto toDTO(Prontuario prontuario){
        return modelMapper.map(prontuario, ProntuarioDto.class);
    }

    //    ---------------------    CRUD METODOS    ---------------------

    public List<ProntuarioDto> findAll(){
        return repository.findAll().stream().map(this::toDTO).toList();
    }

    public ProntuarioDto findById(Long id) {
        return repository.findById(id)
                .map(this::toDTO)
                .orElseThrow(() -> new EntityNotFoundException("Agenda não encontrado com o ID: " + id));
    }

    public ProntuarioDto post(ProntuarioDto model){
        return toDTO(repository.save(toModel(model)));
    }

    public ProntuarioDto put(ProntuarioDto model, Long id){
        return toDTO(repository.save(toModel(model)));
    }

    public void delete(Long id){ repository.deleteById(id); }


    //    ---------------------    CRUD METODOS    ---------------------
}
