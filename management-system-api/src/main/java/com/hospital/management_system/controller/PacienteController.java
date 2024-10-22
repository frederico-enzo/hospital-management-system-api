package com.hospital.management_system.controller;


import com.hospital.management_system.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/paciente")
public class PacienteController {
    @Autowired
    private PacienteService service;

}
