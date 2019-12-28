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
class User{
    
    private String name;
    
    private int age;

    public User(String name, int age) {
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

}
public class ArrayListUserDefined {
    public static void main(String[] args) {
        // tao ra Arraylist cua class users
        List<User> users = new ArrayList<>();
        // su dung contractor tao object moi de them vao du lieu
        users.add(new User("Rajeev",25));
        users.add(new User("Rajeev",25));
        users.add(new User("Rajeev",25));
        // duyet qua Arraylist
        users.forEach((user) -> {
            System.out.println("Name"+user.getName()+"Age"+user.getAge());
        });
    }
    
}
