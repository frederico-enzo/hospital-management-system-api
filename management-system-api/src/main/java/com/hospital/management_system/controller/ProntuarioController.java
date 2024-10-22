package com.hospital.management_system.controller;

import com.hospital.management_system.service.ProntuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/prontuario")
public class ProntuarioController {
    @Autowired
    private ProntuarioService service;

}
