package com.apps.quantitymeasurement;

/**
 * @author  : Abhinav.Shankar@wipro.com
 * Descriptoin : create the object and do comparison for double value
 */
public class QuantityMeasurementApp {

    public static class Feet {

        public Feet(Double value){

        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }
    }
    public static void main(String[] args) {
        Feet feetObj1 = new Feet(7.99);
        Feet feetObj2 = new Feet(7.99);

        if (feetObj1.equals(feetObj2)){
           System.out.println("printing value for Feet Obj ---> " + Boolean.TRUE);
        }
        else {
            System.out.println("printing value for Feet Obj ---> " + Boolean.FALSE);

        }
    }
}
