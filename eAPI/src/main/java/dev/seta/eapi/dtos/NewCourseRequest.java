package dev.seta.eapi.dtos;

import dev.seta.eapi.dao.users.teacher.Teacher;
import lombok.NonNull;

import java.io.Serializable;

/**
 * DTO for {@link dev.seta.eapi.dao.course.Course}
 */
public record NewCourseRequest(
        @NonNull
        String name,
        String description,
        @NonNull
        Teacher teacher
) implements Serializable {
}