import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Livro } from '../livro';
import { LivroService } from '../livro.service';


@Component({
  selector: 'app-livro-form',
  templateUrl: './livro-form.component.html',
  styleUrls: ['./livro-form.component.less']
})
export class LivroFormComponent  {

  livro:Livro;

   constructor(
    private route: ActivatedRoute, 
      private router: Router, 
        private livroService : LivroService) {
    this.livro = new Livro();
  }

  onSubmit() {
    this.livroService.save(this.livro).subscribe(result => this.gotoLivroList());
  }

  gotoLivroList() {
    this.router.navigate(['/livros']);
  }
}
