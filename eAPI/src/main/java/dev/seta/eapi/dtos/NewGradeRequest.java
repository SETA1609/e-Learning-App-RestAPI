package dev.seta.eapi.dtos;

import dev.seta.eapi.dao.myModule.MyModule;
import dev.seta.eapi.dao.users.student.Student;
import lombok.NonNull;

import java.io.Serializable;

/**
 * DTO for {@link dev.seta.eapi.dao.grade.Grade}
 */
public record NewGradeRequest(
        double score,
        @NonNull
        Student student,
        @NonNull
        MyModule module
) implements Serializable {
}