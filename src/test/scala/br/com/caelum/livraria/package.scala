package br.com.caelum

import java.math.BigDecimal

package object livraria{
  implicit def string2BigDecimal(value:String) = new BigDecimal(value)
}