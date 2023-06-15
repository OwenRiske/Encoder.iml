package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner INPUT = new Scanner(System.in);
        String[] alphabet = {"a", "b", "c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

        System.out.print("Key: ");
        int key= INPUT.nextInt();
        while (true){
            String chosen="";
            while (chosen.equals("")) {
                System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n1.Encrypt \n2.Decrypt\n>");
                chosen = INPUT.nextLine();
            }
        if (chosen.equalsIgnoreCase("decrypt") || chosen.equalsIgnoreCase("d") || chosen.equalsIgnoreCase("1")){

            System.out.println("Input Encrypted Messsage: ");
            String[] userInput =INPUT.nextLine().split("");
            ArrayList output=new ArrayList();
            for (int i = 0; i < userInput.length; i++) {
                for (int j = 0; j < alphabet.length; j++) {
                    if (userInput[i].equals(alphabet[j])){
                        if (j-key<0){
                            j+=alphabet.length;
                        }
                      output.add(alphabet[j-key]);
                      break;
                    }
                }
            }
            for (int i = 0; i < output.size(); i++) {
                System.out.print(output.get(i));}
        }
        else {
            System.out.println("Input Messsage: ");
            String[] userInput =INPUT.nextLine().split("");
            ArrayList output=new ArrayList();
            for (int i = 0; i < userInput.length; i++) {
                for (int j = 0; j < alphabet.length; j++) {
                    if (userInput[i].equals(alphabet[j])){
                        if (j+key>alphabet.length){
                            j-=alphabet.length;
                        }
                        output.add(alphabet[j+key]);
                        break;
                    }
                }
            }
            for (int i = 0; i < output.size(); i++) {
                System.out.print(output.get(i));}        }
    }}}
