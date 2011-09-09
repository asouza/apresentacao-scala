package br.com.caelum.livraria

import org.hibernate.Session
import scala.Long

class LivroDAO(session:Session) {
  def save(livro:Livro) = session.save(livro)


}