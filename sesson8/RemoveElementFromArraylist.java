/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesson8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author thang
 */
public class RemoveElementFromArraylist {
    public static void main(String[] args) {
        List<String> programingLangues = new ArrayList<>();
        programingLangues.add("C");
        programingLangues.add("C++");
        programingLangues.add("Java");
        programingLangues.add("Kotlin");
        programingLangues.add("Python");
        programingLangues.add("perl");
        programingLangues.add("Ruby");
        System.out.println("Initial List : "+programingLangues);
         // xoa 1 phan tu tai vi tri so 5 >> remove perl
         programingLangues.remove(5);
        System.out.println("List after Remove 5: "+programingLangues);
        // xoa phan tu cu the trong arraylist bien tra ve false neu phan tu khong co trong arraylist
        boolean isRemoved = programingLangues.remove("Kotlin");
        System.out.println("After remove kotlin"+programingLangues);
        System.out.println(isRemoved);
        // tao ra 1 arraylist cac phan tu va xoa cac phan tu do tu arraylist co san~
        List<String> scriptingLanguage = new ArrayList<>();
        scriptingLanguage.add("Python");
        scriptingLanguage.add("Ruby");
        scriptingLanguage.add("Perl");
        programingLangues.removeAll(scriptingLanguage);
        System.out.println("After remove scriptlangue"+programingLangues);
        // xoa tat ca cac phan tu  voi dieu kien cu the
        programingLangues.removeIf(new Predicate<String>(){
            public boolean test(String s  ){
                    return s.startsWith("C");
            }
        });
        System.out.println("After removeing all element start with C"+programingLangues);
        // xoa tat ca cac phan tu trong arraylist
        programingLangues.clear();
        System.out.println("After clear "+programingLangues);
    }
   
    
}
