package org.example;

public class Main {
    public static void main(String[] args) {

        MyStringLibrary s = new MyStringLibrary("Privet mir");
        String[] a = new String[s.split().length];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.split()[i];
            System.out.println(a[i]);
        }
        String n = s.toString();
        String e = MyStringLibrary.join("Kak","dela");
        System.out.println(s.equalsIgnoreCase("PrivEt"));
        System.out.println(s.equalsIgnoreCase("poka"));
        System.out.println(MyStringLibrary.format("Stroka %d",4));
        System.out.println(n);
        System.out.println(e);
        System.out.println(s.replace('i','f'));
        System.out.println(s.indexOf('i'));
        System.out.println(s.indexOf('x'));
    }
}
