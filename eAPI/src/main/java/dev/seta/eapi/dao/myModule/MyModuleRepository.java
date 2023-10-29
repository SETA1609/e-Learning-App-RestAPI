package dev.seta.eapi.dao.myModule;

import dev.seta.eapi.dao.myModule.MyModule;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyModuleRepository extends CrudRepository<MyModule, String> {
}