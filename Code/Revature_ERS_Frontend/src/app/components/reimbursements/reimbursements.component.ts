import { Component } from '@angular/core';
import { ReimbursementService } from 'src/app/services/reimbursement.service';

@Component({
  selector: 'app-reimbursements',
  templateUrl: './reimbursements.component.html',
  styleUrls: ['./reimbursements.component.css']
})
export class ReimbursementsComponent {

  constructor(private reimbursementService: ReimbursementService) { }

  reimbursementForm = {
    amount: '',
    description: ''
  };

  reimbursements: any;

  ngOnInit() {
    let observable = this.reimbursementService.getReimbursements();
    observable.subscribe((response: any) => {
      this.reimbursements = response;
    });
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
}
