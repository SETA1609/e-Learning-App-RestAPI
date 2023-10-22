package dev.seta.eapi.repositories;

import dev.seta.eapi.domain.kurz.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {
}