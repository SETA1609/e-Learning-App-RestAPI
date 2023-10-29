package dev.seta.eapi.dao.users.admin;

import dev.seta.eapi.dao.users.admin.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends CrudRepository<Admin, String> {
}