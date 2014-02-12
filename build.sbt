import aether.Aether._

name := "aether-problem_3.0"

version := "0.0.1"

organization := "se.hedefalk"

scalaVersion := "2.10.0"

resolvers ++= Seq(
  "Wooden Stake Repo" at "https://repo.woodenstake.se/all"
)

scalacOptions ++= Seq("-deprecation", "-unchecked")

libraryDependencies ++= {
  Seq()
}

publishTo <<= (version) { v => 
if (v endsWith "SNAPSHOT")
  Some("Wooden Stake Snapshots Local" at "https://repo.woodenstake.se/content/repositories/snapshots/")
else
  Some("Wooden Stake Releases" at "https://repo.woodenstake.se/content/repositories/releases/")
}

seq(aetherSettings: _*)