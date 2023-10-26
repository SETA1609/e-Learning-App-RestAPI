package dev.seta.eapi.repositories;

import dev.seta.eapi.domain.msg.Msg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MsgRepository extends CrudRepository<Msg, String> {
}