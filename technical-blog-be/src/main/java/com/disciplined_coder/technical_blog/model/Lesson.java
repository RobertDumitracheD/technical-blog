package com.disciplined_coder.technical_blog.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jdk.jfr.ContentType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name="lesson")
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String title;

    @NotNull
    private String type;

    @NotNull
    @Column(columnDefinition = "TEXT")
    private String content;

    @NotNull
    private String author;

    @NotNull
    private LocalDateTime createdDate;

    @NotNull
    private LocalDateTime lastModified;
}
