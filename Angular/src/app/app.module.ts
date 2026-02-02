import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { NavbarComponent } from './navbar/navbar.component';
import { LoginComponent } from './login/login.component';
import { SignUpComponent } from './login/sign-up.component';
import { ForgetpasswordComponent } from './login/forgetpassword.component';
import { FooterComponent } from './footer/footer.component';
import { HttpServiceService } from './http-service.service';
import { AuthServiceService } from './auth-service.service';
import { EndpointServiceService } from './endpoint-service.service';
import { ServiceLocatorService } from './service-locator.service';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { DashboardComponent } from './dashboard/dashboard.component';
import { UserComponent } from './user/user.component';
import { RoleComponent } from './role/role.component';
import { CourseComponent } from './course/course.component';
import { CollegeComponent } from './college/college.component';
import { SubjectComponent } from './subject/subject.component';
import { StudentComponent } from './student/student.component';
import { TimetableComponent } from './timetable/timetable.component';
import { FacultyComponent } from './faculty/faculty.component';
import { MarksheetComponent } from './marksheet/marksheet.component';
import { UserListComponent } from './user/user-list.component';
import { TimetableListComponent } from './timetable/timetable-list.component';
import { SubjectListComponent } from './subject/subject-list.component';
import { StudentListComponent } from './student/student-list.component';
import { RoleListComponent } from './role/role-list.component';
import { MarksheetListComponent } from './marksheet/marksheet-list.component';
import { CourseListComponent } from './course/course-list.component';
import { CollegeListComponent } from './college/college-list.component';
import { FacultyListComponent } from './faculty/faculty-list.component';

@NgModule({
  declarations: [
    AppComponent,
    WelcomeComponent,
    NavbarComponent,
    LoginComponent,
    SignUpComponent,
    ForgetpasswordComponent,
    FooterComponent,
    DashboardComponent,
    UserComponent,
    RoleComponent,
    CourseComponent,
    CollegeComponent,
    SubjectComponent,
    StudentComponent,
    TimetableComponent,
    FacultyComponent,
    MarksheetComponent,
    UserListComponent,
    TimetableListComponent,
    SubjectListComponent,
    StudentListComponent,
    RoleListComponent,
    MarksheetListComponent,
    CourseListComponent,
    CollegeListComponent,
    FacultyListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    RouterModule
    
  ],
  providers: [
    HttpServiceService,
    AuthServiceService,
    EndpointServiceService,
    ServiceLocatorService

  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
