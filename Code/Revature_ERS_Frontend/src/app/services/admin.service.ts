import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  constructor(private http: HttpClient) { }

  api = "http://localhost:8080/api/v1/admin";

  allUser() {
    const headers = new HttpHeaders({
      'Content-Type': 'application/json',
      'Authorization': 'Bearer ' + localStorage.getItem('token')
    });
    return this.http.get<any>(this.api + "/users", { headers: headers });
  }
  allReimbursements() {
    const headers = new HttpHeaders({
      'Content-Type': 'application/json',
      'Authorization': 'Bearer ' + localStorage.getItem('token')
    });
    return this.http.get<any>(this.api + "/reimbursements", { headers: headers });
  }
  updateReimbursementStatus(id: number, status: string) {
    const headers = new HttpHeaders({
      'Content-Type': 'application/json',
      'Authorization': 'Bearer ' + localStorage.getItem('token')
    });
    return this.http.put<any>(this.api + "/reimbursements/" + id + "/" + status, {}, { headers: headers });
  }
  deleteReimbursement(id: number) {
    const headers = new HttpHeaders({
      'Content-Type': 'application/json',
      'Authorization': 'Bearer ' + localStorage.getItem('token')
    });
    return this.http.delete<any>(this.api + "/reimbursements/" + id, { headers: headers });
  }
}
