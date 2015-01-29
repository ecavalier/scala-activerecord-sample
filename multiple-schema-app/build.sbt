val _version = "0.3.1-SNAPSHOT"

name := "multiple-schema-sample"

organization := "com.github.aselab"

scalaVersion := "2.11.5"

resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies ++= Seq(
  "com.github.aselab" %% "scala-activerecord" % _version,
  "com.github.aselab" %% "scala-activerecord-play2" % _version,
  jdbc,
  "com.h2database" % "h2" % "1.4.185",
  "org.webjars" %% "webjars-play" % "2.3.2",
  "org.webjars" % "bootstrap" % "3.3.2"
)

activerecordPlaySettings
