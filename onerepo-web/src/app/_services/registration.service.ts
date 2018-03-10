import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { RegistrationData } from '../_models';

@Injectable()
export class RegistrationService {

  constructor(private http: HttpClient) { }

  register(data: RegistrationData) {
    return this.http.post('/api/register', data);
  }
}
