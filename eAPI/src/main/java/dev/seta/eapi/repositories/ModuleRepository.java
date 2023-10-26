package dev.seta.eapi.repositories;

import dev.seta.eapi.domain.modul.ModulE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuleRepository extends CrudRepository<ModulE, String> {
}