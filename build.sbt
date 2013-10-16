name := "Skeleton-App"

scalaVersion := "2.10.3"

seq(Revolver.settings: _*)

resolvers += "spray repo" at "http://repo.spray.io"

libraryDependencies ++= Seq(
    "com.typesafe.akka" %% "akka-actor" % "2.2.0-RC1",
    "com.typesafe.akka" %% "akka-slf4j" % "2.2.0-RC1",
    "ch.qos.logback" % "logback-classic" % "1.0.13",
    "io.spray" % "spray-can" % "1.2-M8",
    "io.spray" % "spray-routing" % "1.2-M8",
    "io.spray" %%  "spray-json" % "1.2.5",
    "com.typesafe.slick" %% "slick" % "1.0.1",
    "postgresql" % "postgresql" % "9.1-901.jdbc4",
    // testing
    "org.scalatest" %% "scalatest" % "2.0.RC2" % "test",
    "com.typesafe.akka" %% "akka-testkit" % "2.2.0-RC1" % "test",
    "io.spray" % "spray-testkit" % "1.2-M8" % "test"
)
