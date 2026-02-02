package com.functionalinterface.dataexportfeature;

public class ExportMain {
public static void main(String[] args) {
	ReportExporter r1 = new SalesReport();
	r1.exportToCSV();
	r1.exportToPDF();
	r1.exportToJSON();
}
}
