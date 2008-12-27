package com.freshbooks.model;


public enum RequestMethod {
    CLIENT_CREATE("client.create"),
    CLIENT_UPDATE("client.update"),
    CLIENT_GET("client.get"),
    CLIENT_DELETE("client.delete"),
    CLIENT_LIST("client.list"),

    INVOICE_CREATE("invoice.create"),
    INVOICE_UPDATE("invoice.update"),
    INVOICE_GET("invoice.get"),
    INVOICE_DELETE("invoice.delete"),
    INVOICE_LIST("invoice.list"),
    
    EXPENSE_CREATE("expense.create"),
    EXPENSE_UPDATE("expense.update"),
    EXPENSE_GET("expense.get"),
    EXPENSE_DELETE("expense.delete"),
    EXPENSE_LIST("expense.list"),
    
    CATEGORY_CREATE("category.create"),
    CATEGORY_UPDATE("category.update"),
    CATEGORY_GET("category.get"),
    CATEGORY_DELETE("category.delete"),
    CATEGORY_LIST("category.list"),
    
    PAYMENT_CREATE("payment.create"),
    PAYMENT_UPDATE("payment.update"),
    PAYMENT_GET("payment.get"),
    PAYMENT_DELETE("payment.delete"),
    PAYMENT_LIST("payment.list");
    
    final String id;

    private RequestMethod(String id) {
        this.id = id;
    }
    
    
}