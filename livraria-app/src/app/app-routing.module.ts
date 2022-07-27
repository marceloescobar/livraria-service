import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LivroListComponent } from './livro-list/livro-list.component';
import { LivroFormComponent } from './livro-form/livro-form.component';


const routes: Routes = [
  { path: 'livros', component: LivroListComponent },
  { path: 'addLivro', component: LivroFormComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
