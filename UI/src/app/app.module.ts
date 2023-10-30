import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TestComponent } from './MyComponents/test/test.component';
import { NavbarComponent } from './MyComponents/navbar/navbar.component';
import { MainPageComponent } from './MyComponents/main-page/main-page.component';
import { AboutComponent } from './MyComponents/about/about.component';
import { LoginComponent } from './MyComponents/login/login.component';
import { RegisterComponent } from './MyComponents/register/register.component';
import { RESTAPIServiceService } from './restapiservice.service';

@NgModule({
  declarations: [
    AppComponent,
    TestComponent,
    NavbarComponent,
    MainPageComponent,
    AboutComponent,
    LoginComponent,
    RegisterComponent,
  ],
  imports: [BrowserModule, AppRoutingModule],
  providers: [RESTAPIServiceService],
  bootstrap: [AppComponent],
})
export class AppModule {}
