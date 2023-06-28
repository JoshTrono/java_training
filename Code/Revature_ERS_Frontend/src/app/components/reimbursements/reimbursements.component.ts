import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { ReimbursementService } from 'src/app/services/reimbursement.service';

@Component({
  selector: 'app-reimbursements',
  templateUrl: './reimbursements.component.html',
  styleUrls: ['./reimbursements.component.css']
})
export class ReimbursementsComponent {

  constructor(private reimbursementService: ReimbursementService, private route: Router) { }

  reimbursementForm = {
    amount: '',
    description: ''
  };

  reimbursements: any;

  Admin = false;

  ngOnInit() {
    let observable = this.reimbursementService.getReimbursements();
    observable.subscribe((response: any) => {
      this.reimbursements = response;
    });
    if (localStorage.getItem('role') === 'ADMIN') {
      this.Admin = true;
    } else {
      this.Admin = false;
    }

  }

  createReimbursement() {
    let observable2 = this.reimbursementService.createReimbursement(this.reimbursementForm);
    observable2.subscribe((response: any) => {
      console.log(response);
      this.ngOnInit();
    });

  }
  deleteReimbursement(id: any) {
    let observable3 = this.reimbursementService.deleteReimbursement(id);
    observable3.subscribe((response: any) => {
      this.ngOnInit();
    });
  }
  clickedButton(nav: String) {
    this.route.navigate([nav]);
  }
}
