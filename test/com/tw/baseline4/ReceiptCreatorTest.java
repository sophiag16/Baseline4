package com.tw.baseline4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReceiptCreatorTest {
    @Test
    public void shouldReturnReceiptOfGivenItem() {
        String[] itemInfo = "1 book at 12.49".split(" ");
        ReceiptCreator receiptCreator = new ReceiptCreator(itemInfo);

        receiptCreator.receipt();

        assertEquals("1 book: 12.49\n" +
                "Sales Taxes: 0.0\n" +
                "Total: 12.49", receiptCreator.receipt());
    }
}
