package com.lawrenceweetman.schrodinger;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SchrodingerBooleanTest {

    @Test
    public void createdBooleanEvaluatesToTrue() throws Exception {
        SchrodingerBoolean schrodingerBoolean = new SchrodingerBoolean();
        assertTrue(schrodingerBoolean.isTrue());
    }

    @Test
    public void createdBooleanEvaluatesToFalse() throws Exception {
        SchrodingerBoolean schrodingerBoolean = new SchrodingerBoolean();
        assertTrue(schrodingerBoolean.isFalse());
    }

    @Test
    public void setToTrueEvaluatesAsTrue() throws Exception {
        SchrodingerBoolean schrodingerBoolean = new SchrodingerBoolean();
        schrodingerBoolean.set(true);
        assertTrue(schrodingerBoolean.isTrue());
    }

    @Test
    public void setToTrueDoesNotEvaluateAsFalse() throws Exception {
        SchrodingerBoolean schrodingerBoolean = new SchrodingerBoolean();
        schrodingerBoolean.set(true);
        assertFalse(schrodingerBoolean.isFalse());
    }

    @Test
    public void setToFalseEvaluatesAsFalse() throws Exception {
        SchrodingerBoolean schrodingerBoolean = new SchrodingerBoolean();
        schrodingerBoolean.set(false);
        assertTrue(schrodingerBoolean.isFalse());
    }

    @Test
    public void setToFalseDoesNotEvaluateAsTrue() throws Exception {
        SchrodingerBoolean schrodingerBoolean = new SchrodingerBoolean();
        schrodingerBoolean.set(false);
        assertFalse(schrodingerBoolean.isTrue());
    }

}