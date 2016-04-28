package com.company;




public class Main {



    public static void main(String[] args) {


        String n = "100";
       int num1 = Integer.parseInt(n);
        System.out.print(num1 / 2);

        double num2 = Double.parseDouble(n);
        System.out.print(num2 / 2);


        float num = Float.parseFloat(n);
        System.out.print(num/2);


//
//        String convertedNumber = Float.toString(num);
//        System.out.print(convertedNumber/2);
    }




    public static void sayMyNameForMe(int nu){
        System.out.println("My name is Edwin Nwofor and my age is "+nu);
    }
}
