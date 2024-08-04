import { Injectable } from '@angular/core';
import {LessonRestService} from "./lesson-rest.service";

@Injectable({
  providedIn: 'root'
})
export class LessonService {

  constructor(private lessonRestService: LessonRestService) { }
}
