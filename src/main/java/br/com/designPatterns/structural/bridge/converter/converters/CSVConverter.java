package br.com.designPatterns.structural.bridge.converter.converters;

import br.com.designPatterns.structural.bridge.converter.employees.Employee;

import java.util.Locale;

public class CSVConverter implements Converter {

	@Override
	public String getEmployeeFormated(Employee emp) {
		return String.format(Locale.US, "%s,%d,%.2f", 
				emp.getName(),
				emp.getAge(),
				emp.getSalary());
	}

}
