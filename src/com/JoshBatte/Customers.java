package com.JoshBatte;

import java.util.ArrayList;

public class Customers {

    String customerName;
    ArrayList<Double> transactions = new ArrayList<Double>();

    public Customers(String customerName, ArrayList<Double> transactions) {
        this.customerName = customerName;
        this.transactions = transactions;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Double> transactions) {
        this.transactions = transactions;
    }


}
