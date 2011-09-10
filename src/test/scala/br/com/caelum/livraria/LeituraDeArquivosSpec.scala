package br.com.caelum.livraria

import java.util.Scanner
import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import java.io.{File, PrintWriter}

class LeituraDeArquivosSpec extends FlatSpec with ShouldMatchers{

    behavior of "lendo arquivos"

    it should "ler cada linha de cada arquivo" in {
    val t1 = System.currentTimeMillis
    (1 to 1000).par.foreach { n =>
      Thread.sleep(5)
    }
    val t2 = System.currentTimeMillis
    println(t2-t1)
  }
}