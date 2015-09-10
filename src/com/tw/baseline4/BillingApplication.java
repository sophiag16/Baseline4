/* the Application that is a wrapper to everything*/
package com.tw.baseline4;

public class BillingApplication {

    public static void main(String[] args) {
        BillingApplication billingApplication = new BillingApplication();
        billingApplication.start();
    }

    public void start() {
        System.out.println("1 book: 12.49\n" +
                "Sales Taxes: 0.0\n" +
                "Total: 12.49");
    }
}
