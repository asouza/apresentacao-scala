
name := "Livraria"

//val repo1         = "repo1"     at "http://repo1.maven.org/maven2/"
//  val jboss         = "jboss"     at "http://repository.jboss.org/nexus/content/groups/public/"
//  val mavensnapshots= "snaps"     at "https://oss.sonatype.org/content/repositories/snapshots"
//  val javanet       = "javanet"   at "http://download.java.net/maven/2/"
//  val releases      = "releases"  at "http://scala-tools.org/repo-releases"
  //val snapshots     = "snapshots" at "http://scala-tools.org/repo-snapshots"
libraryDependencies ++= Seq(
  "org.hibernate"           % "hibernate-core"        % "3.6.6.Final"     % "compile",
  "org.hibernate"           % "hibernate-c3p0"        % "3.6.6.Final"     % "compile",
  "mysql"                   % "mysql-connector-java"  % "5.1.15"          % "compile",
  "org.mortbay.jetty"       % "jsp-2.1"               % "6.1.14"          % "provided",
  "javax.servlet"           % "servlet-api"           % "2.5"          % "provided",
  "org.mortbay.jetty"       % "jetty"                 % "6.1.22"          % "test",
  "org.scalatest"           % "scalatest_2.9.0"       % "1.6.1"           % "test",
  "org.mockito"             % "mockito-core"          % "1.8.5"           % "test"
)
