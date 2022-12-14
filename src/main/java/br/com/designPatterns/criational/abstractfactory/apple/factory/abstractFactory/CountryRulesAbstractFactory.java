package br.com.designPatterns.criational.abstractfactory.apple.factory.abstractFactory;

import br.com.designPatterns.criational.abstractfactory.apple.model.certificate.Certificate;
import br.com.designPatterns.criational.abstractfactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}
