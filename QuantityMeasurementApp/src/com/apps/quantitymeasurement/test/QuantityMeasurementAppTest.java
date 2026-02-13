package com.apps.quantitymeasurement.test;

import com.apps.quantitymeasurement.QuantityMeasurementApp;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuantityMeasurementAppTest {

    @Test
    public void FailTest(){
        QuantityMeasurementApp ob = new QuantityMeasurementApp();

        QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(7.99);
        QuantityMeasurementApp.Feet feet2 = new QuantityMeasurementApp.Feet(7.99);

        boolean actual = feet1.equals(feet2);

        assertFalse(actual);

    }


    @Test
    public void PassTest(){
        QuantityMeasurementApp ob = new QuantityMeasurementApp();

        QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(7.99);
        QuantityMeasurementApp.Feet feet2 = new QuantityMeasurementApp.Feet(7.99);

        boolean actual = feet1.equals(feet2);

        assertTrue(actual);

    }
}
