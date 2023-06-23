import { TestBed } from '@angular/core/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';

import { ReimbursementService } from './reimbursement.service';

describe('ReimbursementService', () => {
  let service: ReimbursementService;
  let httpMock: HttpTestingController;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [ HttpClientTestingModule ],
      providers: [ ReimbursementService ]
    });
    service = TestBed.inject(ReimbursementService);
    httpMock = TestBed.inject(HttpTestingController);
  });

  afterEach(() => {
    httpMock.verify();
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });

  it('should fetch reimbursements', () => {
    const mockReimbursements = [{ id: 1, user: { email: 'test@test.com' }, amount: 100, description: 'Test', status: 'Pending' }];
    service.getReimbursements().subscribe((reimbursements: any) => {
      expect(reimbursements).toEqual(mockReimbursements);
    });
    const req = httpMock.expectOne('http://localhost:8080/api/v1/reimbursements');
    expect(req.request.method).toBe('GET');
    req.flush(mockReimbursements);
  });
});
