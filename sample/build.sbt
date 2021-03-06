val _version = "0.4.0-SNAPSHOT"

name := "scala-activerecord-sample"

organization := "com.github.aselab"

version := _version

scalaVersion := "2.12.1"

resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies ++= Seq(
  "com.github.aselab" %% "scala-activerecord" % _version,
  "com.h2database" % "h2" % "1.4.193",
  "org.slf4j" % "slf4j-nop" % "1.7.24"
  // for debug
  //"org.slf4j" % "slf4j-api" % "1.7.24",
  //"ch.qos.logback" % "logback-classic" % "1.2.1"
)

scalacOptions ++= Seq("-deprecation", "-unchecked")

discoveredMainClasses in Compile ~= {_.sorted}

activerecordGeneratorSettings
