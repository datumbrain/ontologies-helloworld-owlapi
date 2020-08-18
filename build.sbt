name := "ontologies-helloworld-owlapi"

version := "0.1"

scalaVersion := "2.13.3"

mainClass in (Compile, run) := Some("com.datumbrain.ontologies.Main")

// https://mvnrepository.com/artifact/net.sourceforge.owlapi/owlapi-apibinding
libraryDependencies += "net.sourceforge.owlapi" % "owlapi-distribution" % "5.1.0"
