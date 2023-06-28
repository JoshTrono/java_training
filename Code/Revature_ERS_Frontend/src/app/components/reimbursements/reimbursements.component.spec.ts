import { ComponentFixture, TestBed } from '@angular/core/testing';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { of } from 'rxjs';

import { ReimbursementsComponent } from './reimbursements.component';
import { ReimbursementService } from 'src/app/services/reimbursement.service';

describe('ReimbursementsComponent', () => {
  let component: ReimbursementsComponent;
  let fixture: ComponentFixture<ReimbursementsComponent>;
  let reimbursementService: ReimbursementService;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ReimbursementsComponent ],
      imports: [ HttpClientTestingModule ],
      providers: [ ReimbursementService ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ReimbursementsComponent);
    component = fixture.componentInstance;
    reimbursementService = TestBed.inject(ReimbursementService);
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should fetch reimbursements on init', () => {
    const reimbursements = [{ id: 1, user: { email: 'test@test.com' }, amount: 100, description: 'Test', status: 'Pending' }];
    spyOn(reimbursementService, 'getReimbursements').and.returnValue(of(reimbursements));
    fixture.detectChanges();
    expect(component.reimbursements).toEqual(reimbursements);
  });

  it('should set Admin to true if role is ADMIN', () => {
    localStorage.setItem('role', 'ADMIN');
    fixture.detectChanges();
    expect(component.Admin).toBeTrue();
  });

  it('should set Admin to false if role is not ADMIN', () => {
    localStorage.setItem('role', 'USER');
    fixture.detectChanges();
    expect(component.Admin).toBeFalse();
  });

  it('should create a reimbursement', () => {
    const reimbursementForm = { amount: '100', description: 'Test' };
    spyOn(reimbursementService, 'createReimbursement').and.returnValue(of({}));
    spyOn(component, 'ngOnInit');
    component.reimbursementForm = reimbursementForm;
    component.createReimbursement();
    expect(reimbursementService.createReimbursement).toHaveBeenCalledWith(reimbursementForm);
    expect(component.ngOnInit).toHaveBeenCalled();
  });

  it('should delete a reimbursement', () => {
    const id = 1;
    spyOn(reimbursementService, 'deleteReimbursement').and.returnValue(of({}));
    spyOn(component, 'ngOnInit');
    component.deleteReimbursement(id);
    expect(reimbursementService.deleteReimbursement).toHaveBeenCalledWith(id);
    expect(component.ngOnInit).toHaveBeenCalled();
  });
});
