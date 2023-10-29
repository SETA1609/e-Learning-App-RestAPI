package dev.seta.eapi.dtos;

import dev.seta.eapi.dao.course.Course;
import dev.seta.eapi.dao.myModule.MyModule;
import dev.seta.eapi.dao.users.teacher.Teacher;
import lombok.NonNull;

import java.io.Serializable;

/**
 * DTO for {@link MyModule}
 */
public record NewModuleRequest(
        @NonNull
        String name,
        String description,
        @NonNull
        Teacher teacher,
        @NonNull
        Course course
) implements Serializable {
}