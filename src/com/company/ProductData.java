package com.company;

import javafx.scene.paint.Stop;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by raulbuzila on 1/4/2016.
 */
public class ProductData {
    Scanner intrare= new Scanner(System.in);
    Scanner insert1= new Scanner(System.in);
    Scanner insert2=new Scanner(System.in);
    String name,type;


    double price, final_price,tva;

    double GetData(){
        System.out.print ("\n\t Enter the name of the product = ");
        name=intrare.nextLine();




        System.out.print("\n\t Enter the price of the product = ");
        price=insert1.nextDouble();

        System.out.println("\n\t What type of product is it? Food or non-food");
        type=insert2.nextLine();
        return price;
    }

    void Calculate(){
        if (type =="food"){
            tva=0.09;
        } else if (type =="non-food"){
            tva=0.24;
        }
        final_price=price*tva;

    }

    void Display(){
        System.out.print("\n\t Nume produs:  "+ name);
        System.out.print("\n\t Pret produs:  "+ final_price);

    }
}
