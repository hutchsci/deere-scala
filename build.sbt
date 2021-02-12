name := "functional-examples"

version := "1.0"

scalaVersion := "2.12.8"

resolvers += Resolver.mavenLocal

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.12" % Test,
  "org.mockito" % "mockito-core" % "1.10.19" % Test,
  "org.scalamock" %% "scalamock-scalatest-support" % "3.5.0" % Test,
  "org.scalatest" %% "scalatest" % "3.0.1" % Test,
  "com.novocode" % "junit-interface" % "0.11" % Test
)
