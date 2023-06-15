import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class SessionService {

  private api: String = 'http://localhost:8080';

  constructor(private http: HttpClient) { }

  login(username: string, password: string) {
    const param = new HttpParams().set('username', username).set('password', password);
    return this.http.post(`${this.api}/login`, param);
  }
}
