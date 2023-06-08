import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TaskComponentsComponent } from './components/task-components/task-components.component';
import { SessionComponentComponent } from './components/session-component/session-component.component';

@NgModule({
  declarations: [
    AppComponent,
    TaskComponentsComponent,
    SessionComponentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
