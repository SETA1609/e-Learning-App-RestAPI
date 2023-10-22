package dev.seta.eapi.repositories;

import dev.seta.eapi.domain.modul.Module;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModuleRepository extends JpaRepository<Module, String> {
}