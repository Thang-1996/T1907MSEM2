/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesson8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thang
 */
public class SearchElementInArrayList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Steve");
        names.add("Maria");
        names.add("Marie");
        //check xem co phan tu trong array
        System.out.println("Does Bob name in array? "+ names.contains("Bob"));
        // tim kiem vi tri cua phan tu trong chuoi
        System.out.println("index of Steve"+ names.indexOf("Steve"));
        System.out.println("index of Maria"+ names.indexOf("Maria"));
        // tim vi tri xuat hien cuoi cung cua phan tu trong chuoi
        System.out.println("Last Index of John"+ names.lastIndexOf("John"));
        System.out.println("Last Index of Bill" + names.lastIndexOf("Bill"));
    }
}
