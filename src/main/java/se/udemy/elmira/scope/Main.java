package se.udemy.elmira.scope;

public class Main {
    public static void main(String[] args) {
        Counter c = new Counter();
        c.incrementCount(60);
        System.out.println(c.count);
    }
}
