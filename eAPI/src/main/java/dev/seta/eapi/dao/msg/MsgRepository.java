package dev.seta.eapi.dao.msg;

import dev.seta.eapi.dao.msg.Msg;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MsgRepository extends CrudRepository<Msg, String> {
}