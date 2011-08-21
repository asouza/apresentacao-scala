package br.com.caelum.livraria

import java.io.Serializable
import org.hibernate._
import jdbc.Work
import java.sql.Connection
import java.math.BigDecimal
import techtalk.Livro

class FakeSession extends Session{
  def getLobHelper = null

  def getTypeHelper = null

  def disableFetchProfile(p1: String) {}

  def enableFetchProfile(p1: String) {}

  def isFetchProfileEnabled(p1: String) = false

  def reconnect(p1: Connection) {}

  def reconnect() {}

  def disconnect() = null

  def doWork(p1: Work) {}

  def setReadOnly(p1: AnyRef, p2: Boolean) {}

  def isReadOnly(p1: AnyRef) = false

  def getStatistics = null

  def disableFilter(p1: String) {}

  def getEnabledFilter(p1: String) = null

  def enableFilter(p1: String) = null

  def getEntityName(p1: AnyRef) = ""

  def get(p1: String, p2: Serializable, p3: LockOptions) = null

  def get(p1: String, p2: Serializable, p3: LockMode) = null

  def get(p1: String, p2: Serializable) = null

  def get(p1: Class[_], p2: Serializable, p3: LockOptions) = null

  def get(p1: Class[_], p2: Serializable, p3: LockMode) = null

  def get(clazz: Class[_], obj: Serializable) = {
    //#mangue para apresentacao
    val id = obj.asInstanceOf[Long]
    if(id==1) new Livro(nome="Achou",preco = BigDecimal.ZERO) else null
  }

  def clear() {}

  def getNamedQuery(p1: String) = null

  def createFilter(p1: AnyRef, p2: String) = null

  def createSQLQuery(p1: String) = null

  def createQuery(p1: String) = null

  def createCriteria(p1: String, p2: String) = null

  def createCriteria(p1: String) = null

  def createCriteria(p1: Class[_], p2: String) = null

  def createCriteria(p1: Class[_]) = null

  def getTransaction = null

  def beginTransaction() = null

  def getCurrentLockMode(p1: AnyRef) = null

  def refresh(p1: AnyRef, p2: LockOptions) {}

  def refresh(p1: AnyRef, p2: LockMode) {}

  def refresh(p1: AnyRef) {}

  def buildLockRequest(p1: LockOptions) = null

  def lock(p1: String, p2: AnyRef, p3: LockMode) {}

  def lock(p1: AnyRef, p2: LockMode) {}

  def delete(p1: String, p2: AnyRef) {}

  def delete(p1: AnyRef) {}

  def persist(p1: String, p2: AnyRef) {}

  def persist(p1: AnyRef) {}

  def merge(p1: String, p2: AnyRef) = null

  def merge(p1: AnyRef) = null

  def update(p1: String, p2: AnyRef) {}

  def update(p1: AnyRef) {}

  def saveOrUpdate(p1: String, p2: AnyRef) {}

  def saveOrUpdate(p1: AnyRef) {}

  def save(p1: String, p2: AnyRef) = null

  def save(p1: AnyRef) = {
    println("Salvando... "+p1)
    null
  }

  def replicate(p1: String, p2: AnyRef, p3: ReplicationMode) {}

  def replicate(p1: AnyRef, p2: ReplicationMode) {}

  def load(p1: AnyRef, p2: Serializable) {}

  def load(p1: String, p2: Serializable) = null

  def load(p1: Class[_], p2: Serializable) = null

  def load(p1: String, p2: Serializable, p3: LockOptions) = null

  def load(p1: String, p2: Serializable, p3: LockMode) = null

  def load(p1: Class[_], p2: Serializable, p3: LockOptions) = null

  def load(p1: Class[_], p2: Serializable, p3: LockMode) = null

  def evict(p1: AnyRef) {}

  def contains(p1: AnyRef) = false

  def getIdentifier(p1: AnyRef) = null

  def setDefaultReadOnly(p1: Boolean) {}

  def isDefaultReadOnly = false

  def isDirty = false

  def isConnected = false

  def isOpen = false

  def cancelQuery() {}

  def close() = null

  def connection() = null

  def getSessionFactory = null

  def getCacheMode = null

  def setCacheMode(p1: CacheMode) {}

  def getFlushMode = null

  def setFlushMode(p1: FlushMode) {}

  def flush() {}

  def getSession(p1: EntityMode) = null

  def getEntityMode = null
}
