import { TestBed } from '@angular/core/testing';

import { LessonRestService } from './lesson-rest.service';

describe('LessonRestService', () => {
  let service: LessonRestService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(LessonRestService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
