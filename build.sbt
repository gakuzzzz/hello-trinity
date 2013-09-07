name := "hello-trinity"

version := "0.1.0"

scalaVersion := "2.10.2"

resolvers ++= Seq(
  "Sisioh Trinity Release Repository" at "http://sisioh.github.io/trinity/repos/release/",
  "Seasar Repository" at "http://maven.seasar.org/maven2/"
)

libraryDependencies ++= Seq(
  "org.sisioh"          %% "trinity-core"               % "0.0.18",
  "org.sisioh"          %% "trinity-view"               % "0.0.18",
  "org.sisioh"          %% "trinity-view-scalate"       % "0.0.18",
  "com.github.seratch"  %% "scalikejdbc"                % "[1.6,)",
  "com.h2database"       % "h2"                         % "1.3.170" % "test"
)
