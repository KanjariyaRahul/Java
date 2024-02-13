// Hierarchical Inheritance Example
import java.util.*;

class User {
    Scanner sc = new Scanner(System.in);
    int no1, no2;

    User() {
        System.out.print("Enter First Number : ");
        no1 = sc.nextInt();
        System.out.print("Enter Second Number : ");
        no2 = sc.nextInt();
        System.out.println("-----------------------");
    }
}

class Add extends User {
    Add() {
        System.out.println(" Addition is :  " + (no1 + no2));
    }
}

class Sub extends User {
    Sub() {
        System.out.println("Subtraction is :  " + (no1 - no2));
    }
}

class Hir_inh {

    public static void main(String[] args) {
        Add add = new Add();
        System.out.println("------------------------------");
        Sub s = new Sub();

    }
}
