version := "0.1"
ThisBuild / organization := "com.bizone"

ThisBuild / scalaVersion := "2.12.10"
crossScalaVersions := Seq("2.11.11", "2.12.3")

autoCompilerPlugins := true

autoCompilerPlugins := true

lazy val commonSettings = Seq(
  name := "velocity-test",
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
    "-P:linter:printWarningNames:false",
    "-P:linter:enable-only:UseHypot+CloseSourceFile+OptionOfOption"
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
  "org.apache.commons" % "commons-lang3" % "3.12.0",
  "com.google.code.gson" % "gson" % "2.8.7",
  "com.google.guava" % "guava" % "14.0"

)
lazy val app = project
  .in(file("."))
  .settings(commonSettings)
  .settings(addCompilerPlugin("org.psywerx.hairyfotr" %% "linter" % "0.1.17"): _*)

//unmanagedBase := baseDirectory.value / "lib"

coverageMinimum := 30

coverageFailOnMinimum := true

coverageHighlighting := true