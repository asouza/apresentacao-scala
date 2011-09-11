package br.com.caelum.livraria

import org.hibernate.Session


class Livros(session:Session) extends Dynamic {
  def by(id:Long):Option[Livro] = {
    Option(
    session.get(classOf[Livro],id).asInstanceOf[Livro]
    )
  }

  def applyDynamic(methodName: String)(args: Any*) = {
    println("&*((****" + methodName)
  }
 }


























//def applyDynamic(methodName: String)(args: Any*) = {
//       println("executando metodo dinamico "+methodName+ "com os argumentos" + args)
//   }