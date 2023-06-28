import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {


  private api = "http://localhost:8080/api/v1/auth";

  constructor(private httpClient: HttpClient) { }

  Admin = false;

  login(email: String, password: String) {
    return this.httpClient.post<any>(this.api + "/authenticate", { email, password });
  }
  getRole(token: any) {
    return this.httpClient.get<any>(this.api + "/role", { headers: { Authorization: `Bearer ${token}` } });
  }
  register(email: String, password: String) {

    return this.httpClient.post<any>(this.api + "/register", { email, password });
  }
  isAdmin() {
    if (localStorage.getItem('role') === 'ADMIN') {
      this.Admin = true;
    } else {
      this.Admin = false;
    }
  }
}
