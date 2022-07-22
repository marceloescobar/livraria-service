import { Component, OnInit } from '@angular/core';
import { Livro } from '../livro';
import { LivroService } from '../livro.service';

@Component({
  selector: 'app-livro-list',
  templateUrl: './livro-list.component.html',
  styleUrls: ['./livro-list.component.less']
})
export class LivroListComponent implements OnInit {

  livros: Livro[];

  constructor(private livroService: LivroService) {
  }

  ngOnInit() {
    this.livroService.findAll().subscribe(data => {
      this.livros = data;
    });
  }

}
