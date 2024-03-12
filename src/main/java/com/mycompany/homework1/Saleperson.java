/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework1;

/**
 *
 * @author yarom
 */
public class Saleperson {
    public void modify(Telephone phone) {
        String modifiedManufacturer = phone.manufacturer.replace('o', 'a');
        String modifiedVersion = phone.version.replace('o', 'a');

        if (!(modifiedManufacturer.toLowerCase().startsWith("n")) || !(modifiedManufacturer.toLowerCase().startsWith("N"))) {
            modifiedManufacturer = modifiedManufacturer.toLowerCase();
        }

        phone.manufacturer = modifiedManufacturer;
        phone.version = modifiedVersion;
    }
    
}
