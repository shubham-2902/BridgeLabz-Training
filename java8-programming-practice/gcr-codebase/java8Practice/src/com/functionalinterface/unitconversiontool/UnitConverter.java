package com.functionalinterface.unitconversiontool;
interface UnitConverter {

    static double kmToMiles(double km) {
        return km * 0.621371;
    }

    static double kgToPounds(double kg) {
        return kg * 2.20462;
    }
}
