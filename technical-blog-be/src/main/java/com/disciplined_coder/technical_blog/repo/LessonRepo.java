package com.disciplined_coder.technical_blog.repo;

import com.disciplined_coder.technical_blog.model.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepo extends JpaRepository<Lesson, Long> {
}
