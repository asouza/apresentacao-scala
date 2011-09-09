package br.com.caelum.livraria

import java.util.Scanner
import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers


class LeituraDeArquivosSpec extends FlatSpec with ShouldMatchers{

    behavior of "lendo arquivos"

    it should "ler cada linha de cada arquivo" in {
    val t1 = System.currentTimeMillis
    (1 to 1000).foreach { n =>
        val scanner = new Scanner("arquivo_"+n)
        while(scanner.hasNextLine){
            val linha = scanner.nextLine
        }
    }
    val t2 = System.currentTimeMillis
    println(t2-t1)
  }
}