package dev.seta.eapi.repositories;

import dev.seta.eapi.domain.users.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, String> {
}