package com.example.Main;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a noun: ");
        String noun = input.next();

        System.out.println("Enter a verb: ");
        String verb = input.next();

        System.out.println("Enter a adjective: ");
        String adj = input.next();

        System.out.println("Enter a adverb: ");
        String adv = input.next();

        System.out.print("Do you " + verb + " your " + adj + " " + noun + " " + adv + "? That's so funny!");

    }
}
