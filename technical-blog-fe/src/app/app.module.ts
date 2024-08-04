import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { BlogNavbarComponent } from './blog-navbar/blog-navbar.component';
import { ContentNavbarComponent } from './content-navbar/content-navbar.component';
import { BlogContentComponent } from './blog-content/blog-content.component';
import { LearningPageComponent } from './blog-content/learning-page/learning-page.component';
import { ListLessonsComponent } from './blog-content/learning-page/list-lessons/list-lessons.component';
import { LessonComponent } from './blog-content/learning-page/lesson/lesson.component';
import { AppRoutingModule } from './app-routing.module';
import {LessonService} from "./service/lesson.service";

@NgModule({
  declarations: [
    AppComponent,
    BlogNavbarComponent,
    ContentNavbarComponent,
    BlogContentComponent,
    LearningPageComponent,
    ListLessonsComponent,
    LessonComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [LessonService],
  bootstrap: [AppComponent]
})
export class AppModule { }
