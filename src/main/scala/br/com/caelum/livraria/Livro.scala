package br.com.caelum.livraria

import java.lang.Long
import javax.persistence.{GeneratedValue, Id, Entity}
import org.hibernate.Session

@Entity
case class Livro(var nome:String, val preco:BigDecimal) {

  @Id @GeneratedValue
  var id:Long = _

}