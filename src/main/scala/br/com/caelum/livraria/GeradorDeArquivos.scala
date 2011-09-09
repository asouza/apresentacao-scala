package br.com.caelum.livraria

import java.io.{PrintStream, FileOutputStream}

object GeradorDeArquivos {

  def main(args:Array[String]) {
    (1 to 1000).foreach { numero =>
          val fos = new FileOutputStream("arquivo_"+numero)
          val ps = new PrintStream(fos)
          ps.println("escrevendo alguma coisa aleatoria")
          ps.println("escrevendo alguma coisa aleatoria")
          ps.println("escrevendo alguma coisa aleatoria")
          ps.println("escrevendo alguma coisa aleatoria")
          ps.println("escrevendo alguma coisa aleatoria")
          ps.flush

    }
  }
}