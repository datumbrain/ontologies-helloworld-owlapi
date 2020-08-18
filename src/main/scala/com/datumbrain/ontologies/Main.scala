package com.datumbrain.ontologies

import org.semanticweb.owlapi.apibinding.OWLManager
import org.semanticweb.owlapi.formats.RDFXMLDocumentFormat
import org.semanticweb.owlapi.model.IRI

object Main {
  def main(args: Array[String]): Unit = {
    val manager = OWLManager.createOWLOntologyManager
    val ontology = manager.loadOntology(IRI.create("https://protege.stanford.edu/ontologies/pizza/pizza.owl"))
    ontology.saveOntology(new RDFXMLDocumentFormat, System.out)
  }
}
