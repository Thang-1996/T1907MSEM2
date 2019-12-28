/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesson8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author thang
 */
public class ArraylistIterator {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(13);
        number.add(18);
        number.add(25);
        number.add(40);
        Iterator<Integer> numberIterator = number.iterator();
        while(numberIterator.hasNext()){
            Integer num = numberIterator.next();
            if(num %2 !=0){
                numberIterator.remove();
            }
        }
        System.out.println(number);
    }
    
}
