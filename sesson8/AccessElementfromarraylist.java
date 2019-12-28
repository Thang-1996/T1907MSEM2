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
public class AccessElementfromarraylist {
    public static void main(String[] args) {
        List<String> topCompanies = new ArrayList<>();
        // kiem tra xem arraylist dang trong hay khong
        System.out.println("Top companies is empty ?"+ topCompanies.isEmpty());
        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazzon");
        topCompanies.add("Facebook");
        //kiem tra do dai cua arraylist
        System.out.println("here is size of the arraylist"+topCompanies.size());
        // truy cap phan tu trong arraylist
        // tao ra 1 bien de luu tru du lieu o vi tri so 0
        String bestCompay = topCompanies.get(0);
        String secondbestCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(topCompanies.size() - 1);
        System.out.println("Best Company"+bestCompay);
        System.out.println("Second Best Company"+secondbestCompany);
        System.out.println("Last company"+lastCompany);
        // thay doi vi tri so 4 cua chuoi~ arraylist facebook = walmart
        topCompanies.set(4,"Walmart");
        System.out.println(topCompanies);
        
    }
}
