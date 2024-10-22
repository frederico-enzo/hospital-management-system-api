package com.hospital.management_system.service;

import com.hospital.management_system.dto.RelatorioDto;
import com.hospital.management_system.model.Relatorio;
import com.hospital.management_system.repository.RelatorioRepository;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public RelatorioDto create(RelatorioDto model){
        return toDTO(repository.save(toModel(model)));
    }
    public RelatorioDto read(Long id) {
        return repository.findById(id)
                .map(this::toDTO)
                .orElseThrow(() -> new EntityNotFoundException("Relatório não encontrado com o ID: " + id));
    }

    public RelatorioDto update(RelatorioDto model){
        return toDTO(repository.save(toModel(model)));
    }
    public void delete(Long id){ repository.deleteById(id);}

}
