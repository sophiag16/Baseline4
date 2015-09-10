//Has a string and creates receipt from it
package com.tw.baseline4;

public class ReceiptCreator {
    private String[] itemInfo;

    public ReceiptCreator(String[] itemInfo) {
        this.itemInfo = itemInfo;
    }

    public String receipt() {
        String receipt = "";
        for(int i = 0; i < itemInfo.length - 3; i++) {
            receipt += itemInfo[i]+ " ";
        }
        receipt += itemInfo[itemInfo.length - 3] + ": " +itemInfo[itemInfo.length - 1] + "\n" +
                "Sales Taxes: 0.0\n" +
                "Total: " + itemInfo[itemInfo.length - 1];
        return receipt;
    }
}
