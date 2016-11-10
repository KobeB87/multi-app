package com.formiz.bean;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FormizTest {

        @Test
        public void testGetNumeroDossier() {
        	Formiz model = new Formiz();
                model.setNumeroDossier("1");
                String expected = "1";
                assertEquals(expected, model.getNumeroDossier());
        }
}