import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AdminService } from 'src/app/services/admin.service';

@Component({
  selector: 'app-reimbursements-admin',
  templateUrl: './reimbursements-admin.component.html',
  styleUrls: ['./reimbursements-admin.component.css']
})
export class ReimbursementsAdminComponent {
  users = undefined;
  reimbursements = undefined;
  constructor(private admin: AdminService, private route: Router) { }

  allUsers() {
    this.admin.allUser().subscribe((data) => {
      this.users = data;
    })
  }
  allReimbursements() {
    this.admin.allReimbursements().subscribe((data) => {
      this.reimbursements = data;
    });
  }
  deleteUser(id: any) {
    this.admin.deleteUser(id);
    this.allUsers();
  }
  changePassword(id: any) {
    this.admin.changePassword(id);
  }
  deleteReimbursement(id: any) {
    this.admin.deleteReimbursement(id);
    this.allReimbursements();
  }
  changeStatus(reimbursement: any) {
    if (reimbursement) {
      this.route.navigate(['status', reimbursement]);
    }
  }
}
