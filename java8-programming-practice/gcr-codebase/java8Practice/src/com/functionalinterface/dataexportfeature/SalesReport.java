package com.functionalinterface.dataexportfeature;
class SalesReport implements ReportExporter {

    public void exportToCSV() {
        System.out.println("Sales report exported as CSV");
    }

    public void exportToPDF() {
        System.out.println("Sales report exported as PDF");
    }
}
