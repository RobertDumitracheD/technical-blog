package com.disciplined_coder.technical_blog.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Lesson not found")
public class LessonException extends RuntimeException{
    public LessonException(String message) {
        super(message);
    }
}
