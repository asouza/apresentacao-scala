package br.com.caelum.livraria

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import org.hibernate.Session
import collection.immutable.List
import java.util.{Scanner, Calendar}
import java.lang.Long


class LivroSpec extends FlatSpec with ShouldMatchers {

  behavior of "bigdecimal"

  implicit def string2bigdecimal(str:String) = BigDecimal(str)

  it should "deixar menos chato passar bigdecimal como parametro" in {
    val livro = new Livro("Tech talk", "25.44")
    imprime(livro.preco)

  }






















  implicit def calendarBostetico2Maroto(cal:Calendar) = new {
     def plusDay(num:Int) = {
       val novo = cal.clone().asInstanceOf[Calendar]
       novo.add(Calendar.DAY_OF_MONTH, num)
       novo
     }
  }

  it should "deixar calendar menos bostetico" in {
    import br.com.caelum.livraria.ConverterMaroto._
    val hoje = Calendar.getInstance

    val amanha = hoje + 20 dia

    hoje should not be amanha
  }
























  it should "usar collections eficientemente" in {
      val livros = List(
         Livro("Scala in action", new BigDecimal("99.99")),
         Livro("Livro de arquitetura", new BigDecimal("123")),
         Livro("REST in practice", new BigDecimal("49.99")),
         Livro("Crepusculo", new BigDecimal("99.99")),
         Livro("Eclipse", new BigDecimal("99.99")),
         Livro("Lua Nova", new BigDecimal("99.99")),
         Livro("Amanhecer", new BigDecimal("99.99"))
      )

    livros.map(_.nome).foreach(println)

  }























  behavior of "salvando de forma marota"

  implicit def obj2AR(obj:{def id:Long}) = new ActiveRecord(new FakeSession, obj)

  it should "salvar de uma maneira esperta" in {
    implicit val session = new FakeSession

    val livro = new Livro("techday", new BigDecimal("25"))

    livro.save

  }





















  it should "buscar evitando null pointer" in {
    val session = new FakeSession
    val livroAchado = new Livros(session).by(id = 2)


    val livro = livroAchado.getOrElse(new Livro(nome = "", preco = new BigDecimal("0")))
    println(livro.nome)
  }





















  ignore should "duck typing" in {
    //
  }







































  it should "trabalhar bem com operações lentas" in {
    val t1 = System.currentTimeMillis

    (1 to 1000).par.foreach({  n=>
      Thread.sleep(5)
    })

    val t2 = System.currentTimeMillis
    imprime(t2-t1)
  }

























  it should "buscar dinamicamente" in {
    val session = new FakeSession
    new Livros(session).byNome("jao")
  }


  def imprime(obj:Any) {
    println("\n\n\n")
    println("             => " + obj)
    println("\n\n\n")
  }

}