/* the Application that is a wrapper to everything*/
package com.tw.baseline4;

import java.util.Scanner;

public class BillingApplication {

    public static void main(String[] args) {
        BillingApplication billingApplication = new BillingApplication();
        billingApplication.start();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        String[] itemInfo = scanner.nextLine().split(" ");
        String receipt = "";

        for(int i = 0; i < itemInfo.length - 3; i++) {
            receipt += itemInfo[i]+ " ";
        }
        receipt += itemInfo[itemInfo.length - 3] + ": " +itemInfo[itemInfo.length - 1] + "\n" +
                "Sales Taxes: 0.0\n" +
                "Total: " + itemInfo[itemInfo.length - 1];

        System.out.println(receipt);
    }
}
