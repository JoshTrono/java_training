import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { ReimbursementsComponent } from './components/reimbursements/reimbursements.component';

const routes: Routes = [
  {path:'login', component: LoginComponent},
  {path:'reimbursement', component: ReimbursementsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }