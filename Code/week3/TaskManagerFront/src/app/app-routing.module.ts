import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SessionComponentComponent } from './components/session-component/session-component.component';
import { TaskComponentsComponent } from './components/task-components/task-components.component';


const routes: Routes = [
  { path: 'register', component: SessionComponentComponent },
  { path: 'tasks', component: TaskComponentsComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
