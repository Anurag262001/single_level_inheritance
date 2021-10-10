package com.company;
public class Main {
    int a = 10;

    void display() {
        System.out.println("parent");
    }
}
class test1 extends Main{
    int b= 20;
    void show(){
        System.out.println("child");
    }
}
class inherit{
    public static void main(String[] args) {
        test1 obj = new test1();
        System.out.println(obj.a);
        obj.show();
        obj.display();
        System.out.println(obj.b);
    }
}

