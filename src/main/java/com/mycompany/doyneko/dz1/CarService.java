/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.doyneko.dz1;

/**
 *
 * @author yulia
 */
public class CarService {
    public static void modify(Car car) {
        String brand = car.getBrand();
        brand = brand.toLowerCase();
        brand = brand.replace('a', 'o');
        brand = brand.replace('i', 'e');
        car.setBrand(brand);
    }
}