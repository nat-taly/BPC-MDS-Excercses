package vut.fekt.ukol1;

import java.util.ArrayList;

public class MyClass implements ISum {
    public static int count = 0;
    public static ArrayList<Integer> list = new ArrayList<>();


    //constructors
    public MyClass(){
        count++;
    }
    public MyClass(int... numbers) throws IllegalArgumentException {
        this();
        for (int i : numbers) {
            addInteger(i);
        }
    }

    public static int getCount(){
        return count;
    }

    //class methods
    public void addInteger(int i) throws IllegalArgumentException {
        if(i >= 0){
            list.add(i);
        } else {
            throw new IllegalArgumentException("something to write");
        }
    }

    public static MyClass createUnited(MyClass first, MyClass second){
        MyClass newobject = new MyClass();
        newobject.list.addAll(first.list);
        newobject.list.addAll(second.list);
        return newobject;
    }

    public boolean ifExists(int i) {
        return list.contains(i);
    }

    @Override
    public int Sum(){
        int sum = 0;
        for(int i:list){
            sum+=i;
        }
        return sum;
    }

    public void print(){
        System.out.println("print something" + list.size());
        for(int i:list){
            System.out.println(i);
        }
        System.out.println("\n");
    }

    @Override
    public String toString(){
        return "some text here " + list.size() + " some text here " + Sum();
    }
}
