package br.com.caelum.livraria

import java.util.Calendar


object ConverterMaroto {
  implicit def calendarMaisMaroto(cal:Calendar) = new {
    var x = 0
    def +(num:Int) = {
      x = num
      this
    }

    def dia = {
      val novo = cal.clone().asInstanceOf[Calendar]
      novo.add(Calendar.DAY_OF_MONTH, x)
      novo
    }
  }
}