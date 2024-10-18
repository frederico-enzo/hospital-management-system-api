package com.hospital.management_system.controller;

import com.hospital.management_system.repository.AgendaRepository;
import com.hospital.management_system.repository.ProntuarioRepository;
import com.hospital.management_system.service.AgendaService;
import com.hospital.management_system.service.ProntuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/prontuario")
public class ProntuarioController {
    @Autowired
    private ProntuarioService service;
    @Autowired
    private ProntuarioRepository repository;

    @GetMapping("/lista")
    public ResponseEntity<?> listarAll(){
        return ResponseEntity.ok(this.repository.findAll());
    }
}
