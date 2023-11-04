package com.bootcamp.exercise.day2;

public class IntroString {

    public static void main(String[] args) {
        initString();

    }

    static void initString() {
        String strObject = new String("CodeId");
        String strObject2 = new String("CodeId");
        String strObject5 = strObject2;
        String strObject3 = "CodeId";
        String strObject4 = "CodeId";
        StringBuffer strBuffer = new StringBuffer("CodeId");

        System.out.println(strObject.equals(strBuffer));

    }
}
