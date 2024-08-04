package com.disciplined_coder.technical_blog.service;

import com.disciplined_coder.technical_blog.dto.LessonRequest;
import com.disciplined_coder.technical_blog.dto.LessonResponse;
import com.disciplined_coder.technical_blog.exception.LessonException;
import com.disciplined_coder.technical_blog.mapper.LessonMapper;
import com.disciplined_coder.technical_blog.model.Lesson;
import com.disciplined_coder.technical_blog.repo.LessonRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LessonService {

    private final LessonRepo lessonRepo;

    public LessonResponse getLesson(Long id) {
        Lesson lesson = lessonRepo.findById(id)
                .orElseThrow(() ->
                        new LessonException("Lesson with id " + id + " is missing"));
        return LessonMapper.fromEntityToResponse(lesson);
    }

    public Long createLesson(LessonRequest newLesson) {
        Lesson newLessonEntity = LessonMapper.fromRequestToEntity(newLesson);
        return lessonRepo.save(newLessonEntity).getId();
    }

    public List<Lesson> getAll() {
        return lessonRepo.findAll();
    }

    public void deleteLesson(Long id) {
        if (!lessonRepo.existsById(id)) {
            throw new LessonException("Lesson with ID " + id + " not found.");
        }
        lessonRepo.deleteById(id);
    }
}
