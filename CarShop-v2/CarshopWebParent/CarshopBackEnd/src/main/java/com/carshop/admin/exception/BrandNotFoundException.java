package com.carshop.admin.exception;

public class BrandNotFoundException extends RuntimeException{

    public BrandNotFoundException(String message) {
        super(message);
    }
}
