import { Component } from '@angular/core';
import { AdminService } from 'src/app/services/admin.service';

@Component({
  selector: 'app-reimbursements-admin',
  templateUrl: './reimbursements-admin.component.html',
  styleUrls: ['./reimbursements-admin.component.css']
})
export class ReimbursementsAdminComponent {
  users = undefined;
  reimbursements = undefined;
  constructor(private admin: AdminService) { }

  allUsers() {
    this.admin.allUser().subscribe((data) => {
      this.users = data;
    })
  }
  deleteUser(id: any) {
    this.admin.deleteUser(id);
    this.allUsers();
  }
  changePassword(id: any) {
    this.admin.changePassword(id);
  }
}
