package dev.seta.eapi.dao.grade;

import dev.seta.eapi.dao.grade.Grade;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeRepository extends CrudRepository<Grade, String> {
}