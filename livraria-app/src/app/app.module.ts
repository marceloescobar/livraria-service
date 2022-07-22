import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LivroListComponent } from './livro-list/livro-list.component';
import { LivroFormComponent } from './livro-form/livro-form.component';

@NgModule({
  declarations: [
    AppComponent,
    LivroListComponent,
    LivroFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
