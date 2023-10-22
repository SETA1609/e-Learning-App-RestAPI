package dev.seta.eapi.repositories;

import dev.seta.eapi.domain.users.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, String> {
}