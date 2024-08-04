import {Component, OnInit} from '@angular/core';
import {LessonService} from "../../../service/lesson.service";

@Component({
  selector: 'app-list-lessons',
  templateUrl: './list-lessons.component.html',
  styleUrls: ['./list-lessons.component.css']
})
export class ListLessonsComponent implements OnInit{

  constructor(private lessonService: LessonService) {}

  ngOnInit() {

  }
}
