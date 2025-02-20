/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Person {
    //variable
    String Name = "Iqbal ";
    int Age = 123;
    
    public Person(String name,int age) {
        this.Name = name;
        this.Age = age;
    }
    
    public String getName () {
        return Name;
    }
    
    public int getAge () {
        return Age;
    }
    
    public void setAge (int age){
        this.Age = age;
    }
}
