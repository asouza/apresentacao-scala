import java.io.File
import sbt._
import sbt.Process._
import scala.{Some, Right, Left}

class GnarusProject(info:ProjectInfo)
                extends DefaultWebProject(info)
{

  val repo1         = "repo1"     at "http://repo1.maven.org/maven2/"
  val jboss         = "jboss"     at "http://repository.jboss.org/nexus/content/groups/public/"
  val mavensnapshots= "snaps"     at "https://oss.sonatype.org/content/repositories/snapshots"
  val javanet       = "javanet"   at "http://download.java.net/maven/2/"
  val releases      = "releases"  at "http://scala-tools.org/repo-releases"
  //val snapshots     = "snapshots" at "http://scala-tools.org/repo-snapshots"
  val vraptor       = "br.com.caelum"           % "vraptor"               % "3.4.0-SNAPSHOT"  % "compile"
  val scalate       = "org.fusesource.scalate"  % "scalate-web"           % "1.4.1"           % "compile"
  val hibernate     = "org.hibernate"           % "hibernate-core"        % "3.6.6.Final"     % "compile"
  val hibernatec3p0 = "org.hibernate"           % "hibernate-c3p0"        % "3.6.6.Final"     % "compile"
  val mysql         = "mysql"                   % "mysql-connector-java"  % "5.1.15"          % "compile"
  val jsp           = "org.mortbay.jetty"       % "jsp-2.1"               % "6.1.14"          % "provided"
  val servlet       = "javax.servlet"           % "servlet-api"           % "2.5"          % "provided"
//  val core          = "com.github.scala-incubator.io" %% "core"           % "0.2.0-SNAPSHOT"
//  val file          = "com.github.scala-incubator.io" %% "file"           % "0.2.0-SNAPSHOT"

  val jetty6        = "org.mortbay.jetty"       % "jetty"                 % "6.1.22"          % "test"
  val scalatest     = "org.scalatest"           % "scalatest_2.9.0"       % "1.6.1"           % "test"
  val mockito       = "org.mockito"             % "mockito-core"          % "1.8.5"           % "test"

  override def compileOptions = super.compileOptions ++
       compileOptions("-Xexperimental")

}
