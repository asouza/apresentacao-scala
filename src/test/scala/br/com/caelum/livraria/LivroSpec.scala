package br.com.caelum.livraria

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import java.math.BigDecimal
import org.hibernate.Session
import org.mockito.Mockito
import collection.immutable.List
import java.util.{Scanner, Calendar}
import Conversions._
import scala.collection.JavaConversions._

class LivroSpec extends FlatSpec with ShouldMatchers {
  behavior of "bigdecimal"

  implicit def str2bigDecimal(str:String) = new BigDecimal(str)

  it should "deixar menos chato passar bigdecimal como parametro" in {
    val livro = new Livro("Tech talk", "25.44")

    imprime(livro.preco)
  }




























  it should "deixar calendar menos bostetico" in {
    val hoje = Calendar.getInstance

    val amanha = hoje + 1 dia

    hoje should not be amanha
  }
























  behavior of "salvando de forma marota"

  it should "salvar de uma maneira esperta" in {
//    implicit val session = new FakeSession

    val livro = new Livro("techday", new BigDecimal("25"))
//    val dao = new LivroDAO(session)
//    dao.save(livro)
    val janeiro = Calendar.getInstance()

     livro.getVendasAPartirDe(janeiro)

  }























































































  ignore should "buscar dinamicamente" in {
    val session = new FakeSession
    new Livros(session).by(id = 2)
  }


  def imprime(obj:Any) {
    println("\n\n\n")
    println("             => " + obj)
    println("\n\n\n")
  }

}