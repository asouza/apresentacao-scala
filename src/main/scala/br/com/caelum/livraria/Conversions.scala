package br.com.caelum.livraria

import java.util.Calendar
import org.hibernate.Session

object Conversions {
//  implicit val session = new FakeSession
  implicit def calendarParrudo(cal:Calendar) = new {
    var x:Int = _

    def +(qtde:Int) = {
      x = qtde
      this
    }
    def dia = {
      val clone = cal.clone().asInstanceOf[Calendar]
      clone.add(Calendar.DAY_OF_MONTH, x)
      clone
    }
  }

  implicit def pimpLivro(livro:Livro) = new {
    def getVendasAPartirDe(data:Calendar)(implicit session:Session) = {

    }
  }
}