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
public class CreateArraylistfromcollectionexample {
    public static void main(String[] args) {

        List<Integer> firstfiveprimenumbers = new ArrayList<>();
        firstfiveprimenumbers.add(2);
        firstfiveprimenumbers.add(3);
        firstfiveprimenumbers.add(5);
        firstfiveprimenumbers.add(7);
        firstfiveprimenumbers.add(11);
        // them bo suu tap tren tao tiep vao bo suu tap moi
        List<Integer> firsttenprimeNumbers = new ArrayList<>(firstfiveprimenumbers);
        // tao them 1 bo suu tap khac
        List<Integer> nextfiveprimenumbers = new ArrayList<>();
        nextfiveprimenumbers.add(13);
        nextfiveprimenumbers.add(17);
        nextfiveprimenumbers.add(19);
        nextfiveprimenumbers.add(23);
        nextfiveprimenumbers.add(29);
        // add tat ca vao bo suu tap chinh
        firsttenprimeNumbers.addAll(nextfiveprimenumbers);
        System.out.println(firsttenprimeNumbers);
        
    }
}
