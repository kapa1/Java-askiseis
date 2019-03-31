/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class JavaApplication30 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ori, kath, paixtis, telos;
        
        ArrayList<String> list1 = new ArrayList();
        ArrayList<String> list2 = new ArrayList();
        ArrayList<String> list3 = new ArrayList();
        Scanner in = new Scanner(System.in);
        for (int i=0; i<3; i++){
            list1.add(" ");
            list2.add(" ");
            list3.add(" ");
        }
        
        paixtis = 1;
        telos = 0;
        int sum = 0;
        
        do{
         
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
        
        System.out.println("orizontia");
        ori = in.nextInt();
        System.out.println("katheta");
        kath = in.nextInt();
        
        if (paixtis==1){
        if (ori==1){
            if(kath==1){
                list1.set(0,"x");
                paixtis = 2;
                sum = sum + 1;
            }else if (kath==2){
            list1.set(1,"x");
            paixtis = 2;
            sum = sum + 1;
        }else if (kath==3){
            list1.set(2,"x");
            paixtis = 2;
            sum = sum + 1;
        }
        }
        
         if (ori==2){
            if(kath==1){
                list2.set(0,"x");
                paixtis = 2;
                sum = sum + 1;
            }else if (kath==2){
            list2.set(1,"x");
            paixtis = 2;
            sum = sum + 1;
        }else if (kath==3){
            list2.set(2,"x");
            paixtis = 2;
            sum = sum + 1;
        }
        }
         
         if (ori==3){
            if(kath==1){
                list3.set(0,"x");
                paixtis = 2;
                sum = sum + 1;
            }else if (kath==2){
            list3.set(1,"x");
            paixtis = 2;
            sum = sum + 1;
        }else if (kath==3){
            list3.set(2,"x");
            paixtis = 2;
            sum = sum + 1;
        }
        }
        }else if (paixtis==2){
                   if (ori==1){
            if(kath==1){
                list1.set(0,"o");
                paixtis = 1;
                sum = sum + 1;
            }else if (kath==2){
            list1.set(1,"o");
            paixtis = 1;
            sum = sum + 1;
        }else if (kath==3){
            list1.set(2,"o");
            paixtis = 1;
            sum = sum + 1;
        }
        }
        
         if (ori==2){
            if(kath==1){
                list2.set(0,"o");
                paixtis = 1;
                sum = sum + 1;
            }else if (kath==2){
            list2.set(1,"o");
            paixtis = 1;
            sum = sum + 1;
        }else if (kath==3){
            list2.set(2,"o");
            paixtis = 1;
            sum = sum + 1;
        }
        }
         
         if (ori==3){
            if(kath==1){
                list3.set(0,"o");
                paixtis = 1;
                sum = sum + 1;
            }else if (kath==2){
            list3.set(1,"o");
            paixtis = 1;
            sum = sum + 1;
        }else if (kath==3){
            list3.set(2,"o");
            paixtis = 1;
            sum = sum + 1;
        }
        }
        }
        System.out.println(sum);
        
        if (sum==9){
            telos = 1;
        }
        
        
        if (list1.get(0)=="x" && (list2.get(0)=="x" && list3.get(0)=="x")){
            telos = 1;
        }
        if (list1.get(1)=="x" && (list2.get(1)=="x" && list3.get(1)=="x")){
            telos = 1;
        }
        if (list1.get(2)=="x" && (list2.get(2)=="x" && list3.get(2)=="x")){
            telos = 1;
        }
        if (list1.get(0)=="x" && (list1.get(1)=="x" && list1.get(2)=="x")){
            telos = 1;
        }
        if (list2.get(0)=="x" && (list2.get(1)=="x" && list2.get(2)=="x")){
            telos = 1;
        }
        if (list3.get(0)=="x" && (list3.get(1)=="x" && list3.get(2)=="x")){
            telos = 1;
        }
        if (list1.get(0)=="x" && (list2.get(1)=="x" && list3.get(2)=="x")){
            telos = 1;
        }
        if (list1.get(2)=="x" && (list2.get(1)=="x" && list3.get(0)=="x")){
            telos = 1;
        }
        
        
         if (list1.get(0)=="o" && (list2.get(0)=="o" && list3.get(0)=="o")){
            telos = 2;
        }
        if (list1.get(1)=="o" && (list2.get(1)=="o" && list3.get(1)=="o")){
            telos = 2;
        }
        if (list1.get(2)=="o" && (list2.get(2)=="o" && list3.get(2)=="o")){
            telos = 2;
        }
        if (list1.get(0)=="o" && (list1.get(1)=="o" && list1.get(2)=="o")){
            telos = 2;
        }
        if (list2.get(0)=="o" && (list2.get(1)=="o" && list2.get(2)=="o")){
            telos = 2;
        }
        if (list3.get(0)=="o" && (list3.get(1)=="o" && list3.get(2)=="o")){
            telos = 2;
        }
        if (list1.get(0)=="o" && (list2.get(1)=="o" && list3.get(2)=="o")){
            telos = 2;
        }
        if (list1.get(2)=="o" && (list2.get(1)=="o" && list3.get(0)=="o")){
            telos = 2;
        }
        
        
         
        }while (telos==0);
        
        
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
        
        if (sum==9){
            System.out.println("DRAW");
        }else  {
            System.out.println("winner" + telos + "paixtis");
        }
        
    }
    
}
