package com.softtek.presentacion.api;

public class APITest {
    public static void main(String[] args) {
        String s = "Bienvenidos al curso de Java";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.substring(s.indexOf("Bienvenidos"), s.indexOf("Bienvenidos")+"Bienvenidos".length()));
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("Java")+"Java".length()));
        System.out.println(s.substring(s.indexOf("curso"), s.indexOf("curso")+"curso".length()));
        System.out.println(s.indexOf("c"));
        System.out.println(s.length());
        System.out.println(s.replace("e", "E"));
        System.out.println(s+" con fecha 14 de Septiembre");
    }
}
