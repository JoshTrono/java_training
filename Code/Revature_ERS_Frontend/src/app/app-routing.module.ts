import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { ReimbursementsComponent } from './components/reimbursements/reimbursements.component';
import { RegisterComponent } from './components/register/register.component';
import { ReimbursementsAdminComponent } from './components/reimbursements-admin/reimbursements-admin.component';

const routes: Routes = [
  {path:'login', component: LoginComponent},
  {path:'reimbursement', component: ReimbursementsComponent},
  {path: 'register', component: RegisterComponent},
  {path: 'reimbursementAdmin', component: ReimbursementsAdminComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
