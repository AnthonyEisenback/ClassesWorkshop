//package com.company;
//
//import java.util.Scanner;
//
//public class Cat extends Pet {
//    private boolean hasFur;
//    private String color;
//    private String gender;
//    private String name;
//
//    public Cat(boolean hasFur, String color, String gender, String name, String petsName) {
//
//        super(hasFur, color, gender, name, petsName);
//
//        this.hasFur = hasFur;
//        this.color = color;
//        this.gender = gender;
//        this.name = name;
//        this.petsName = petsName;
//    }
//
//    Scanner meow = new Scanner(System.in);
//
//
//    private String petsName;
//
//    public Cat() {
//        System.out.println("what is your cats name?");
//        name(meow.nextLine());
//
//    }
//
//    public Cat(boolean hasFur, String color, char gender) {
//        this.hasFur = hasFur;
//        this.color = color;
//        this.gender = gender;
//    }
//
//    public boolean isHasFur() {
//        return hasFur;
//    }
//
//    public void setHasFur(boolean hasFur) {
//        this.hasFur = hasFur;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public String getPetsName() {
//        return petsName;
//    }
//
//    public void setPetsName(String petsName) {
//        this.petsName = petsName;
//    }
//
//
//    @Override
//    public char getGender() {
//        return "Meowwwww!!!";
//    }
//
//}
