package dev.seta.eapi.dao.unit;

import dev.seta.eapi.dao.unit.Unit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitRepository extends CrudRepository<Unit, String> {
}