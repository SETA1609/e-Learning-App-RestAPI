package dev.seta.eapi.domains.users;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MyUserRepository extends CrudRepository<MyUser, String> {

    MyUser findByMyUserId(String id);

    Optional<MyUser> findByUsername(String username);

    Optional<MyUser> findByEmail(String email);


    @Modifying
    @Query("update MyUser e set e.role = :role where e.username = :username")
    void updateRoleByUsername(@Param("username") String username, @Param("role") Role role);
}