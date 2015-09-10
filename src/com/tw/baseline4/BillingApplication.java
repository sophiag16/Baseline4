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
        ReceiptCreator receiptCreator = new ReceiptCreator(itemInfo);
        System.out.println(receiptCreator.receipt());
    }
}
