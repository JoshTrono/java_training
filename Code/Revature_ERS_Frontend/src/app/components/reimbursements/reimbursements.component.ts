import { Component } from '@angular/core';
import { ReimbursementService } from 'src/app/services/reimbursement.service';

@Component({
  selector: 'app-reimbursements',
  templateUrl: './reimbursements.component.html',
  styleUrls: ['./reimbursements.component.css']
})
export class ReimbursementsComponent {

  constructor(private reimbursementService: ReimbursementService) { }

  reimbursements: any;

  ngOnInit() {
    let observable = this.reimbursementService.getReimbursements();
    observable.subscribe((response: any) => {
      this.reimbursements = response;
      console.log(this.reimbursements);
    });
  }
}
