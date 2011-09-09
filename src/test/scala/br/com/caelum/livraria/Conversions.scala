package br.com.caelum.livraria

import java.math.BigDecimal
import java.util.Calendar

object Conversions {

  implicit def str2Bd(str:String) = new BigDecimal(str)

  implicit def calendarBostetico2PimpedCaledar(cal:Calendar) = new {
    def plusDay(num:Int) = {
      val copia = cal.clone.asInstanceOf[Calendar]
      copia.add(Calendar.DAY_OF_MONTH,num)
      copia
    }
  }
}