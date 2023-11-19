package dev.seta.eapi.domains.token;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface TokenRepository extends JpaRepository<Token, Integer> {
/*
    @Query(value = """
       select t from Token t inner join MyUser u
            on t.myUser.myUserId = u.myUserId
            where u.myUserId = :id and (t.expired = false or t.revoked = false)
      """)
    List<Token> findAllValidTokenByUser(@Param("myUserId") String id);

    Optional<Token> findByToken(String token);
*/
}