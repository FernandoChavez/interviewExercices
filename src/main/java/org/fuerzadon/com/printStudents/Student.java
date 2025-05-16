package org.fuerzadon.com.printStudents;

public class Student {
    private static int countId = 1;
    private int id;
    private String name;


    public Student (String nombre){
        this.name = nombre;
        this.id = countId++;
    }

    public void showInformation(){
        System.out.println(id + "->" + name);
    }

    @Override
    public String toString(){
        return id + "->" + name;
    }
}
