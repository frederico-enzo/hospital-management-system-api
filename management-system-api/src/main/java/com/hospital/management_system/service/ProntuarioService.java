package com.hospital.management_system.service;

import com.hospital.management_system.dto.ProntuarioDto;
import com.hospital.management_system.dto.RelatorioDto;
import com.hospital.management_system.model.Prontuario;
import com.hospital.management_system.repository.ProntuarioRepository;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public ProntuarioDto create(ProntuarioDto model){
        return toDTO(repository.save(toModel(model)));
    }
    public ProntuarioDto update(ProntuarioDto model){
        return toDTO(repository.save(toModel(model)));
    }
    public void delete(Long id){ repository.deleteById(id);}
    public ProntuarioDto read(Long id) {
        return repository.findById(id)
                .map(this::toDTO)
                .orElseThrow(() -> new EntityNotFoundException("Prontuario não encontrado com o ID: " + id));
    }
}
