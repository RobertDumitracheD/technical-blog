import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {ILesson} from "../models/ILesson";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class LessonRestService {
  url = "http://localhost:8080/lesson"

  constructor(private httpClient: HttpClient) {
  }

  public getLessonList(): Observable<ILesson[]> {
    return this.httpClient.get<ILesson[]>(this.url);
  }
}
