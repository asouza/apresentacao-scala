package br.com.caelum.livraria

import org.hibernate.Session


class Livros(session:Session) {
  def by(id:Long) = session.get(classOf[Livro],id).asInstanceOf[Livro]

 }


























//def applyDynamic(methodName: String)(args: Any*) = {
//       println("executando metodo dinamico "+methodName+ "com os argumentos" + args)
//   }