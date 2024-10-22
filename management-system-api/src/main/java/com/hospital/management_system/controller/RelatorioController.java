package com.hospital.management_system.controller;

import com.hospital.management_system.dto.AgendaDto;
import com.hospital.management_system.dto.RelatorioDto;
import com.hospital.management_system.repository.ProntuarioRepository;
import com.hospital.management_system.repository.RelatorioRepository;
import com.hospital.management_system.service.ProntuarioService;
import com.hospital.management_system.service.RelatorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/relatorio")
public class RelatorioController {
    @Autowired
    private RelatorioService service;
    @Autowired
    private RelatorioRepository repository;

    @GetMapping("/lista")
    public ResponseEntity<?> listarAll(){
        return ResponseEntity.ok(this.repository.findAll());
    }
    @PostMapping
    public ResponseEntity<RelatorioDto> create(@RequestBody RelatorioDto model) {
        return ResponseEntity.ok(service.create(model));
    }
    @PutMapping("/{id}")
    public ResponseEntity<RelatorioDto> update(@RequestBody RelatorioDto model) {
        return ResponseEntity.ok(service.update(model));

    }

}
