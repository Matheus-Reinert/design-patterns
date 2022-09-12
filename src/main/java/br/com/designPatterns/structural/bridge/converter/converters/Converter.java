package br.com.designPatterns.structural.bridge.converter.converters;

import br.com.designPatterns.structural.bridge.converter.employees.Employee;

public interface Converter {
	String getEmployeeFormated(Employee emp);
}
