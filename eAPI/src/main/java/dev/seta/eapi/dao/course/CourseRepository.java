package dev.seta.eapi.dao.course;

import dev.seta.eapi.dao.course.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends CrudRepository<Course, String> {
}