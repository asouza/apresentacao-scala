package br.com.caelum.livraria

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import java.math.BigDecimal
import java.util.Calendar
import org.hibernate.Session
import org.mockito.Mockito
import br.com.caelum.livraria.Conversions._
import techtalk.Livro


class LivroSpec extends FlatSpec with ShouldMatchers {
  behavior of "promocao"

  ignore should "melhorar o uso de bigdecimal" in {
    //aqui é meio chato ficar trabalhando com isso
    new Livro(nome = "techday",preco = "20.5")
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

  ignore should "melhorar a caca do calendar" in {
    val livro = new Livro(nome = "tomara que de certo",preco = new BigDecimal(23.0))
    /*
      problemas?
      nao posso usar hoje e ir somando pq é mutavel...
      verborragico
     */
//    val doisDiasAtras = Calendar.getInstance()
//    doisDiasAtras.add(Calendar.DAY_OF_MONTH,-2)
//    livro.dataDeInicioDePromocao = doisDiasAtras
    val hoje = Calendar.getInstance
    livro.dataDeInicioDePromocao = hoje minus 2.days
//    val daquiA4Dias = Calendar.getInstance()
//    daquiA4Dias.add(Calendar.DAY_OF_MONTH,4)
//    livro.dataDeFimDePromocao = daquiA4Dias

    livro.dataDeFimDePromocao = hoje plus 4.days
    println(livro.dataDeFimDePromocao.getTime)
    livro.verificaPeriodoDePromocaoParaA(Calendar.getInstance())
  }

  behavior of "salvando de forma marota"

  ignore should  "salvar de uma maneira esperta" in {
      implicit val session = new FakeSession
      val livro = new Livro(nome = "techday",preco = "23.4")
      //new LivroDAO(session).save(livro)
      //livro.save(session)
      livro.save
  }

  ignore should "buscar evitando null pointer" in {
      implicit val session = new FakeSession
    val livro = new Livros().by(2)
    println(livro.nome)
  }

  ignore should "buscar dinamicamente" in {
       implicit val session = new FakeSession
       new Livros().findByName("techtalk")
  }






}