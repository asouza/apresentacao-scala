package br.com.caelum.livraria

import javax.persistence.Entity
import java.math.BigDecimal
import java.util.Calendar
import org.hibernate.Session
import techtalk.Livro

@Entity
class Livro {

  def this(nome:String,preco:BigDecimal) = {
    this()
    this.nome = nome
    this.preco = preco
  }

  var id:Long = _
  var nome:String = _
  var preco:BigDecimal = _
  var dataDeInicioDePromocao:Calendar = _
  var dataDeFimDePromocao:Calendar = _

  def verificaPeriodoDePromocaoParaA(data:Calendar) {
    //aqui a gente joga um implicit
  }

  def save(implicit session:Session) {
    session.save(this)
  }

  override def toString = "Livro nome = %s e preco = %.2f".format(nome,preco)
}

class Livros(implicit session:Session) extends Dynamic{
  def by(id:Long)(implicit session:Session) = session.get(classOf[Livro],id).asInstanceOf[Livro]

  def applyDynamic(methodName: String)(args: Any*) = {
      println("executando metodo dinamico "+methodName+ "com os argumentos" + args)
  }

}
