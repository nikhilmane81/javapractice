package com.nikhil.collection;

import java.util.function.Supplier;

public class SupplierDemo
{
    public static void main(String[] args) {

       Supplier<Double> supplier = Math::random;

        System.out.println(supplier.get());
    }
}
