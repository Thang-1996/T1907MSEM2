/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesson8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author thang
 */
public class ArrayListSort {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Lisa");
        names.add("Jenifer");
        names.add("Mark");
        names.add("David");
        System.out.println("Names"+names);
        //sort using sort() method
        names.sort(new Comparator<String>(){
                public int compare(String name1, String name2){
                    return name1.compareTo(name2);
                }
        });
        // co the su dung sort() theo cach 2
      names.sort((name1,name2) -> name1.compareTo(name2));
      names.sort(Comparator.naturalOrder());
        System.out.println("Sort Name "+names);
    }
    
    
}
