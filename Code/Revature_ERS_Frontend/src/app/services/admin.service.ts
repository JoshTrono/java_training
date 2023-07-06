import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  api = "http://localhost:8080/api/v1/admin";


  changePassword(id: any) {
    const newPassword = window.prompt('Enter your new password:');
    console.log(id + " " + newPassword)
    console.log(newPassword);
    if (newPassword) {
      const headers = new HttpHeaders({
        'Content-Type': 'application/json',
        'Authorization': 'Bearer ' + localStorage.getItem('token')
      });
      const body = { password: newPassword };
      return this.http.put<any>(this.api + "/user/" + id + "/password", body, { headers: headers }).subscribe();
    }
    // Return null if newPassword is falsy
    return null;
  }


  constructor(private http: HttpClient) { }



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
  deleteUser(id: any) {
    const headers = new HttpHeaders({
      'Content-Type': 'application/json',
      'Authorization': 'Bearer ' + localStorage.getItem('token')
    });
    return this.http.delete<any>(this.api + "/user/" + id, { headers: headers }).subscribe(() => {
      this.allUser();
    });
  }
}
