import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EditPageComponent } from './edit-page/edit-page.component';

import { HomePageComponent } from './home-page/home-page.component';


const routes: Routes = [
  { path: 'edit-page', component: EditPageComponent },

  { path: '', component: HomePageComponent }

];



@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
