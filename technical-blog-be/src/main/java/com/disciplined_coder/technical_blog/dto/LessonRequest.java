package com.disciplined_coder.technical_blog.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class LessonRequest {
    @NotNull
    private String title;

    @NotNull
    private String type;

    @NotNull
    private String content;

    @NotNull
    private String author;

    @NotNull
    private LocalDateTime createdDate;

    @NotNull
    private LocalDateTime lastModified;
}
