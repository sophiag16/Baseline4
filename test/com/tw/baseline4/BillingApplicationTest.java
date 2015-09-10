package com.tw.baseline4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class BillingApplicationTest {
    private final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

    @Before
    public void setStreams() {
        System.setOut(new PrintStream(byteArrayOutputStream));
    }

    @After
    public void CleanUpStreams() {
        System.setOut(System.out);
    }

    @Test
    public void shouldProduceReceiptForASingleNonTaxableItem() {
        String input = "1 book at 12.49";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);
        BillingApplication billingApplication = new BillingApplication();

        billingApplication.start();

        assertEquals("1 book: 12.49\n" +
                "Sales Taxes: 0.0\n" +
                "Total: 12.49\n", byteArrayOutputStream.toString());
    }

    @Test
    public void shouldProduceReceiptForAnotherSingleNonTaxableItem() {
        String input = "1 chocolate bar at 0.85";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);
        BillingApplication billingApplication = new BillingApplication();

        billingApplication.start();

        assertEquals("1 chocolate bar: 0.85\n" +
                "Sales Taxes: 0.0\n" +
                "Total: 0.85\n", byteArrayOutputStream.toString());
    }
}
