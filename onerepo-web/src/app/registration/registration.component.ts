import { Component, OnInit } from '@angular/core';

import { FormControl, FormGroup, Validators } from '@angular/forms';

import { RegistrationData } from '../_models';

import { RegistrationService } from '../_services';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  registrationForm = new FormGroup ({
    name: new FormControl('', [Validators.required]),
    username: new FormControl('', [Validators.required]),
    email: new FormControl('', [Validators.required]),
    password: new FormControl('', [Validators.required])
  });

  constructor(private registrationService: RegistrationService) { }

  ngOnInit() {
  }

  onSubmit({ value, valid }: { value: RegistrationData, valid: boolean }) {
    console.log(value, valid);
    this.registrationService.register(this.registrationForm.value).subscribe(
      data => {
        console.log(data);
      }
    );
  }
}
