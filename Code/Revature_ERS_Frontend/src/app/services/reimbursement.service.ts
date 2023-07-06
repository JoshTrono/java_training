import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ReimbursementService {
  deleteReimbursement(id: any) {
    const token = localStorage.getItem('token');
    console.log(token);
    const headers = new HttpHeaders().set('Authorization', `Bearer ${token}`);
    return this.http.delete(this.api + "/delete/" + id, { headers });
  }


  private api = 'http://localhost:8080/api/v1/reimbursements';

  constructor(private http: HttpClient) { }

  getReimbursements() {
    const token = localStorage.getItem('token');
    console.log(token);
    const headers = new HttpHeaders().set('Authorization', `Bearer ${token}`);
    return this.http.get(this.api , { headers });
  }

  createReimbursement(reimbursementForm: { amount: string; description: string; }) {
    const token = localStorage.getItem('token');
    console.log(token);
    const headers = new HttpHeaders().set('Authorization', `Bearer ${token}`);
    return this.http.post(this.api + "/create", reimbursementForm, { headers });
  }
}
