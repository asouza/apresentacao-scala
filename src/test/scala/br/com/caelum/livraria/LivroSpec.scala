package br.com.caelum.livraria

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import java.math.BigDecimal
import org.hibernate.Session
import org.mockito.Mockito
import br.com.caelum.livraria.Conversions._
import collection.immutable.List
import java.util.{Scanner, Calendar}


class LivroSpec extends FlatSpec with ShouldMatchers {
  behavior of "bigdecimal"


  it should "deixar menos chato passar bigdecimal como parametro" in {
    val livro = new Livro("Tech talk", "25")
    println(livro.preco)
  }


  it should "deixar calendar menos bostetico" in {
    val hoje = Calendar.getInstance
    //manguezinho para mostrar a caca
    //        hoje.+( 1). dia
    val amanha = hoje.plusDay(1)

    println(hoje.getTime)

  }

  behavior of "salvando de forma marota"

  it should "salvar de uma maneira esperta" in {
    implicit val session = new FakeSession
    val livro = new Livro("techday", "25")
    livro.save
  }

  it should "buscar evitando null pointer" in {
    implicit val session = new FakeSession
    val livroAchado = new Livros().findById(2)
    println(livroAchado.getOrElse(
      new Livro(nome = "nao achou", preco = "25")))
  }

  it should "duck typing" in {
    //
  }

  it should "enviarEmailUsandoCommons" in {

    //exemplo de funcional com map
  }

  it should "buscar dinamicamente" in {
    implicit val session = new FakeSession
    new Livros().findByName("carnaval em 7 dias")
  }



}