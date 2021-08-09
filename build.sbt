name := "demo-unit-test-volecity-library"

version := "0.1"

scalaVersion := "2.12.10"


lazy val commonSettings = Seq(
  name := "velocity",
  crossPaths := false,
  autoScalaLibrary := false,

  scalacOptions ++= Seq(
    "-encoding",
    "utf8",
    "-deprecation",
    "-feature",
    "-language:dynamics",
    "-language:reflectiveCalls",
    "-language:postfixOps",
    "-language:implicitConversions",
    "-unchecked",
    "-target:jvm-1.8",
    s"-Xplugin:${baseDirectory.value} /lib/linter_2.10-0.1.17.jar",
  ),
  fork := true,
  javacOptions ++= Seq("-source", "1.8", "-target", "1.8")
)

ThisBuild / libraryDependencies ++= Seq(
  "com.typesafe" % "config" % "1.4.1",
  "org.scala-lang" % "scala-compiler" % scalaVersion.value % "provided",
  "org.scalatest" %% "scalatest" % "3.0.0" % "test",
  "junit" % "junit" % "4.11" % Test,
  "org.specs2" % "specs2-core_2.12" % "4.2.0",
  "org.specs2" % "specs2-junit_2.12" % "4.2.0",
  "org.mockito" %% "mockito-scala" % "1.16.37" % "test",
  "org.apache.spark" % "spark-core_2.10" % "1.0.0",
  "org.apache.commons" % "commons-lang3" % "3.12.0",
  "com.google.code.gson" % "gson" % "2.8.7",

)
lazy val app = project
  .in(file("."))

unmanagedBase := baseDirectory.value / "lib"