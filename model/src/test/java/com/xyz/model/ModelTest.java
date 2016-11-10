package com.xyz.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ModelTest {

        @Test
        public void testGetNumeroDossier() {
                Model model = new Model();
                model.setNumeroDossier("1");
                String expected = "1";
                assertEquals(expected, model.getNumeroDossier());
        }
}