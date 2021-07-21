name := "demo-unit-test-volecity-library"

version := "0.1"

scalaVersion := "2.12.10"

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
  "com.google.code.gson" % "gson" % "2.8.7"
)

unmanagedBase := baseDirectory.value / "lib"