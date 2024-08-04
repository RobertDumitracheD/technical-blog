import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import {BlogContentComponent} from "./blog-content/blog-content.component";
import {AppComponent} from "./app.component";
import {LearningPageComponent} from "./blog-content/learning-page/learning-page.component";

const routes : Routes = [
  {path: 'login', component: AppComponent},
  {path: 'home', component: AppComponent},
  {path: 'learning', component: LearningPageComponent},
  {path: '', redirectTo:'/home', pathMatch: "full"}
]

@NgModule({
  declarations: [],
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {

}
