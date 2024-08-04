package com.disciplined_coder.technical_blog.controller;

import com.disciplined_coder.technical_blog.dto.LessonRequest;
import com.disciplined_coder.technical_blog.dto.LessonResponse;
import com.disciplined_coder.technical_blog.model.Lesson;
import com.disciplined_coder.technical_blog.service.LessonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/lesson")
@RestController
@RequiredArgsConstructor
public class LessonController {
    private final LessonService lessonService;

    @GetMapping("/{id}")
    public ResponseEntity<LessonResponse> getLesson(@PathVariable Long id) {
        return new ResponseEntity<>(lessonService.getLesson(id), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Long> createLesson(@RequestBody LessonRequest newLesson) {
        return new ResponseEntity<>(lessonService.createLesson(newLesson), HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<Lesson>> getAllLessons() {
        return new ResponseEntity<>(lessonService.getAll(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteLesson(@PathVariable Long id) {
        lessonService.deleteLesson(id);
    }
}
