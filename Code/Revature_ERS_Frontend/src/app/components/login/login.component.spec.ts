import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LoginComponent } from './login.component';
import { AuthenticationService } from 'src/app/services/authentication.service';
import { of } from 'rxjs';

describe('LoginComponent', () => {
  let component: LoginComponent;
  let fixture: ComponentFixture<LoginComponent>;
  let authenticationService: AuthenticationService;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [LoginComponent]
    });
    fixture = TestBed.createComponent(LoginComponent);
    component = fixture.componentInstance;
    authenticationService = TestBed.inject(AuthenticationService);

    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should call authentication service login method with correct parameters', () => {
    const email = 'test@example.com';
    const password = 'password';
    const response = { token: 'test-token' };
    spyOn(authenticationService, 'login').and.returnValue(of(response));
    component.loginForm.email = email;
    component.loginForm.password = password;
    component.login();
    expect(authenticationService.login).toHaveBeenCalledWith(email, password);
  });

  it('should set token in local storage on successful login', () => {
    const email = 'test@example.com';
    const password = 'password';
    const response = { token: 'test-token' };
    spyOn(authenticationService, 'login').and.returnValue(of(response));
    spyOn(localStorage, 'setItem');
    component.loginForm.email = email;
    component.loginForm.password = password;
    component.login();
    expect(localStorage.setItem).toHaveBeenCalledWith('token', response.token);
  });
});


