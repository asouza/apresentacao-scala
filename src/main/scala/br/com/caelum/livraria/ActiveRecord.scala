package br.com.caelum.livraria

import org.hibernate.Session

class ActiveRecord {

  type ComId = {def id:Long}

  def save(obj:ComId)(implicit session:Session) = new {
    obj.id
    session.save(obj)
  }


}