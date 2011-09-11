package br.com.caelum.livraria

import org.hibernate.Session

class ActiveRecord(session:Session, obj:AnyRef) {
  def save = session.save(obj)
}