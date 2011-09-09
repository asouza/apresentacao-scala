package br.com.caelum.livraria

import javax.persistence.Entity
import java.math.BigDecimal
import java.util.Calendar
import org.hibernate.Session

@Entity
class Livro(var nome:String, val preco:BigDecimal) {

  var id:Long = _

  override def toString = "Livro nome = %s e preco = %.2f".format(nome,preco)

  def save(implicit session:Session) = session.save(this)
}


class Livros(implicit session:Session) extends Dynamic{

  def findById(id:Long) = Option(session.get(classOf[Livro],id).asInstanceOf[Livro])

  def applyDynamic(methodName: String)(args: Any*) = {
      println("executando metodo dinamico "+methodName+ "com os argumentos" + args)
  }

}



































