/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesson8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

/**
 *
 * @author thang
 */
class Person{
    
    private String name;
    
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    

    /**
     * Get the value of age
     *
     * @return the value of age
     */
    public int getAge() {
        return age;
    }

    /**
     * Set the value of age
     *
     * @param age new value of age
     */
    public void setAge(int age) {
        this.age = age;
    }


    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + '}';
    }
    

}
public class ArrayListObjectSort {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Sachin", 47));
         people.add(new Person("Chris", 47));
          people.add(new Person("Rajeev", 47));
           people.add(new Person("David", 47));
           System.out.println("People List"+people);
           // sap xep theo truong tuoi
           people.sort((person1,person2) -> {
               return person1.getAge() - person2.getAge(); //To change body of generated lambdas, choose Tools | Templates.
           });
           // cach 2 sap xep theo truong tuoi
           people.sort(Comparator.comparing(Person::getAge));
           System.out.println("Sort people"+people);
           // sort using Cullections.sort()
           Collections.sort(people,Comparator.comparing(Person::getName));
           System.out.println("Sort person list by name "+people);
    }
}
