package com.disciplined_coder.technical_blog.mapper;

import com.disciplined_coder.technical_blog.dto.LessonRequest;
import com.disciplined_coder.technical_blog.dto.LessonResponse;
import com.disciplined_coder.technical_blog.model.Lesson;

public class LessonMapper {
    public static LessonResponse fromEntityToResponse(Lesson lesson) {
        return LessonResponse.builder()
                .title(lesson.getTitle())
                .content(lesson.getContent())
                .author(lesson.getAuthor())
                .createdDate(lesson.getCreatedDate())
                .lastModified(lesson.getLastModified())
                .type(lesson.getType())
                .build();
    }

    public static Lesson fromRequestToEntity(LessonRequest newLesson) {
        return Lesson.builder()
                .title(newLesson.getTitle())
                .content(newLesson.getContent())
                .author(newLesson.getAuthor())
                .createdDate(newLesson.getCreatedDate())
                .lastModified(newLesson.getLastModified())
                .type(newLesson.getType())
                .build();
    }
}
