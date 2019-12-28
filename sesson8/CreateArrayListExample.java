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
public class CreateArrayListExample {
    public static void main(String[] args) {
        // tao va them arraylist
            List<String> animals = new ArrayList<>();
            animals.add("lion");
             animals.add("tiger");
              animals.add("cat");
               animals.add("dog");
               System.out.println(animals);
              animals.add(2,"eleplant");
              System.out.println(animals);
            
    }

    
}

