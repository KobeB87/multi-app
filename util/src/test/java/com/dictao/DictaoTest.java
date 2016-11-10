package com.dictao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DictaoTest {

        @Test
        public void testGetNumeroDossier() {
        	Dictao model = new Dictao();
                model.setNumeroDossier("1");
                String expected = "1";
                assertEquals(expected, model.getNumeroDossier());
        }
}