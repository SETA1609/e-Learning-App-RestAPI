package dev.seta.eapi.repositories;

import dev.seta.eapi.domain.users.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, String> {
}