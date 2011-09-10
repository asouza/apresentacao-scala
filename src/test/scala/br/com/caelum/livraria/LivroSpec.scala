package br.com.caelum.livraria

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import java.math.BigDecimal
import org.hibernate.Session
import org.mockito.Mockito
import collection.immutable.List
import java.util.{Scanner, Calendar}


class LivroSpec extends FlatSpec with ShouldMatchers {
  behavior of "bigdecimal"

  it should "deixar menos chato passar bigdecimal como parametro" in {
    val livro = new Livro("Tech talk", new BigDecimal(25.44))
    imprime(livro.preco)
  }






























  ignore should "deixar calendar menos bostetico" in {
    val hoje = Calendar.getInstance

    val amanha = hoje
    amanha.add(Calendar.DAY_OF_MONTH, 1)

    hoje should not be amanha
  }
























  ignore should "usar collections eficientemente" in {
      val livros = List(
         Livro("Scala in action", new BigDecimal("99.99")),
         Livro("Livro de arquitetura", new BigDecimal("123")),
         Livro("REST in practice", new BigDecimal("49.99")),
         Livro("Crepusculo", new BigDecimal("99.99")),
         Livro("Eclipse", new BigDecimal("99.99")),
         Livro("Lua Nova", new BigDecimal("99.99")),
         Livro("Amanhecer", new BigDecimal("99.99"))
      )

  }























  behavior of "salvando de forma marota"

  ignore should "salvar de uma maneira esperta" in {
    val session = new FakeSession
    val livro = new Livro("techday", new BigDecimal("25"))
    val dao = new LivroDAO(session)
    dao.save(livro)
  }





















  ignore should "buscar evitando null pointer" in {
    val session = new FakeSession
    val livroAchado = new Livros(session).by(id = 2)
    println(livroAchado.nome)
  }





















  ignore should "duck typing" in {
    //
  }







































  ignore should "trabalhar bem com operações lentas" in {
    val t1 = System.currentTimeMillis


    val t2 = System.currentTimeMillis
    imprime(t2-t1)
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