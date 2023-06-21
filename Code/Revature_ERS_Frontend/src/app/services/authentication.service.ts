import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {

  private api = "http://localhost:8080/api/v1/auth";

  constructor(private httpClient: HttpClient) { }

  login(email: String, password: String) {
    return this.httpClient.post<any>(this.api + "/authenticate", { email, password });
  }
}
