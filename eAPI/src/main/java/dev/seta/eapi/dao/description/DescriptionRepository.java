package dev.seta.eapi.dao.description;

import dev.seta.eapi.dao.description.Description;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DescriptionRepository extends CrudRepository<Description, String> {
}