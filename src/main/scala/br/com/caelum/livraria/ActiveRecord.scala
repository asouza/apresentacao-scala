package br.com.caelum.livraria

import org.hibernate.Session

object ActiveRecord {

  implicit def save(obj:{def id:Long})(implicit session:Session) = new {
    session.save(obj)
  }

}