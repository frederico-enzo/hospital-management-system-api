package com.hospital.management_system.repository;

import com.hospital.management_system.model.Relatorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RelatorioRepository extends JpaRepository<Relatorio, Long> {
}
