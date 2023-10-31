package dev.seta.eapi.domains.myModule;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyModuleRepository extends CrudRepository<MyModule, String> {
}