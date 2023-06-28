import { ComponentFixture, TestBed } from '@angular/core/testing';
import { AuthenticationService } from 'src/app/services/authentication.service';
import { of } from 'rxjs';

import { RegisterComponent } from './register.component';

describe('RegisterComponent', () => {
  let component: RegisterComponent;
  let fixture: ComponentFixture<RegisterComponent>;
  let authenticationService: AuthenticationService;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RegisterComponent ],
      providers: [ AuthenticationService ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RegisterComponent);
    component = fixture.componentInstance;
    authenticationService = TestBed.inject(AuthenticationService);
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should register successfully', () => {
    const registerForm = { username: 'test', password: 'password', confirmPassword: 'password' };
    spyOn(authenticationService, 'register').and.returnValue(of({}));
    component.registerForm = registerForm;
    component.register();
    expect(authenticationService.register).toHaveBeenCalledWith(registerForm.username, registerForm.password);
  });

  it('should show an alert if password and confirm password do not match', () => {
    spyOn(window, 'alert');
    component.registerForm = { username: 'test', password: 'password', confirmPassword: 'notpassword' };
    component.register();
    expect(window.alert).toHaveBeenCalledWith('Password and Confirm Password do not match');
  });

  it('should log an error if registration fails', () => {
    const error = { message: 'Registration failed' };
    spyOn(authenticationService, 'register').and.returnValue(of(error));
    spyOn(console, 'log');
    component.registerForm = { username: 'test', password: 'password', confirmPassword: 'password' };
    component.register();
    expect(console.log).toHaveBeenCalledWith(error);
  });
});
