package dev.seta.eapi.dao.users.student;

import dev.seta.eapi.dao.users.student.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, String> {
}