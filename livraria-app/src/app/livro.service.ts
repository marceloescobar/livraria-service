import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Livro } from '../livro';
import { Observable } from 'rxjs/Observable';

@Injectable({
  providedIn: 'root'
})
export class LivroService {

  private usersUrl: string;

  constructor(private http: HttpClient) {
    this.usersUrl = 'http://localhost:8080/livros';
  }

  public findAll(): Observable<Livro[]> {
    return this.http.get<Livro[]>(this.usersUrl);
  }

  public save(livro: Livro) {
    return this.http.post<Livro>(this.usersUrl, livro);
  }
}
