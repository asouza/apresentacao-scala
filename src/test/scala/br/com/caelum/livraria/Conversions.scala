package br.com.caelum.livraria

import java.math.BigDecimal
import java.util.Calendar

object Conversions {

//  implicit def string2BigDecimal(value:String) = new BigDecimal(value)

  //conversao do calendar
  implicit def calendar2NonShitCalendar(calendar:Calendar) = new {
    def plus(value:Int) = {
      val clonedCalendar = calendar.clone.asInstanceOf[Calendar]
      clonedCalendar.add(Calendar.DAY_OF_MONTH,value)
      clonedCalendar
    }

    def minus(value:Int) = {
      val clonedCalendar = calendar.clone.asInstanceOf[Calendar]
      clonedCalendar.add(Calendar.DAY_OF_MONTH,value * -1)
      clonedCalendar
    }
  }

  implicit def int2PimpedInt(value:Int) = new {
    def days = value
  }
}