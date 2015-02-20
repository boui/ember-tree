import com.typesafe.sbt.web.SbtWeb
import sbt._
import Keys._
import play.Play.autoImport._
import PlayKeys._

object EmberTreeBuild extends Build{
  val appName = "ember-tree"
  val appVersion = "0.1"
  val appDependencies = Seq()
  val scalaVersion = "2.10.4"
  val main = Project(appName, file(".")).enablePlugins(play.PlayScala, SbtWeb).settings(
      version := appVersion,
      libraryDependencies ++= appDependencies
    )
}