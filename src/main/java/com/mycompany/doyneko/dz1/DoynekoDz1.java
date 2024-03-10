/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.doyneko.dz1;


import static com.mycompany.doyneko.dz1.CarService.modify;
import java.util.Scanner;


 public class DoynekoDz1{
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введи название автомобиля на английском: ");
        String brand = scanner.nextLine();
        
        Car car = new Car();
        car.setBrand(brand);
        modify(car);
        
        System.out.println("Изначальная марка автомобиля: " + brand + "; "+"Изменённая марка автомобиля: " + car.getBrand());
    }
 }
