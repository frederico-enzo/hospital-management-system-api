package com.hospital.management_system.service;

import com.hospital.management_system.dto.MedicoDto;
import com.hospital.management_system.dto.PacienteDto;
import com.hospital.management_system.dto.RelatorioDto;
import com.hospital.management_system.model.Paciente;
import com.hospital.management_system.repository.PacienteRepository;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService{
    @Autowired
    private PacienteRepository repository;
    @Autowired
    private ModelMapper modelMapper;

    private Paciente toModel(PacienteDto pacienteDto){
        return modelMapper.map(pacienteDto, Paciente.class);
    }
    private PacienteDto toDTO(Paciente paciente){
        return modelMapper.map(paciente, PacienteDto.class);
    }

    //    ---------------------    CRUD METODOS    ---------------------

    public List<PacienteDto> findAll(){
        return repository.findAll().stream().map(this::toDTO).toList();
    }

    public PacienteDto findById(Long id) {
        return repository.findById(id)
                .map(this::toDTO)
                .orElseThrow(() -> new EntityNotFoundException("Agenda não encontrado com o ID: " + id));
    }

    public PacienteDto post(PacienteDto model){
        return toDTO(repository.save(toModel(model)));
    }

    public PacienteDto put(PacienteDto model, Long id){
        return toDTO(repository.save(toModel(model)));
    }

    public void delete(Long id){ repository.deleteById(id); }


    //    ---------------------    CRUD METODOS    ---------------------

}
