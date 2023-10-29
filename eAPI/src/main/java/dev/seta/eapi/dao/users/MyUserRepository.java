package dev.seta.eapi.dao.users;

import dev.seta.eapi.dao.users.MyUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyUserRepository extends CrudRepository<MyUser, String> {

    String findUsernameById(String id);
}