import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ReimbursementsAdminComponent } from './reimbursements-admin.component';

describe('ReimbursementsAdminComponent', () => {
  let component: ReimbursementsAdminComponent;
  let fixture: ComponentFixture<ReimbursementsAdminComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ReimbursementsAdminComponent]
    });
    fixture = TestBed.createComponent(ReimbursementsAdminComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
