import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { AdminService } from 'src/app/services/admin.service';

@Component({
  selector: 'app-reimbursements',
  templateUrl: './reimbursements.component.html',
  styleUrls: ['./reimbursements.component.css']
})
export class ReimbursementsComponent {

  constructor(private route: ActivatedRoute, private admin: AdminService) { }

  ngOnInit() {
    this.route.queryParams.subscribe(params => {
      const id = params['id'];
    });
    this.admin.getReimbursementById(this.reimbursement.id).subscribe((data) => {
      this.reimbursement = data;
    });
  }
  reimbursement: any = {
    id: '',
    amount: '',
    description: '',
    status: '',
  };

}
