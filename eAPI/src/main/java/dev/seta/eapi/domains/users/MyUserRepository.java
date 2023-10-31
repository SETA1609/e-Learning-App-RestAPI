package dev.seta.eapi.domains.users;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyUserRepository extends CrudRepository<MyUser, String> {

    String findUsernameById(String id);
}