import { Component } from '@angular/core';

@Component({
  selector: 'app-test',
  template: ` <div>
    <h1>Hi this is {{ name }} test component!!!</h1>

    <h2>{{ name.toUpperCase() }}</h2>
    <h2>{{ name.length }}</h2>
    <h2>{{ greet() }}</h2>
    <h2>{{ siteUrl }}</h2>
    <input [disabled]="disabled" value="Hello" type="text" />
    <input #myInput type="text" />
    <button (click)="logMessage(myInput.value)">Log</button>
  </div>`,
  styleUrls: ['./test.component.css'],
})
export class TestComponent {
  public name = 'Arya Jha';
  public siteUrl = window.location.href;
  public disabled = false;

  logMessage(value: any) {
    console.log(value);
  }

  greet() {
    return 'hello ' + this.name;
  }
}
