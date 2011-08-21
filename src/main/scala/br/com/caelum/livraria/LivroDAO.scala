package br.com.caelum.livraria

import org.hibernate.Session
import techtalk.Livro

class LivroDAO(session:Session) {
  def save(livro:Livro) = session.save(livro)
}