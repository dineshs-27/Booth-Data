package BoothDetails;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.time.LocalDate;

import java.time.temporal.ChronoUnit;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) throws IOException {
        Scanner getInput = new Scanner(System.in);
        BufferedReader Input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of people : ");
        int x = getInput.nextInt();
        for(int i=0; i<x; i++){
            System.out.println("\nDetails of people " + (i+1) + " : ");
            System.out.println("Name : ");
            String Name = Input.readLine();
            System.out.println("Date of Birth : ");
            System.out.println("Date : ");
            int Date = getInput.nextInt();
            System.out.println("Month : ");
            int Month = getInput.nextInt();
            System.out.println("Year : ");
            int Year = getInput.nextInt();
            System.out.println("Gender : ");
            String Gender = Input.readLine();
            LocalDate StartDate = LocalDate.of(Year,Month,Date);
            LocalDate EndDate = LocalDate.of(2021,12,31);
            long age = ChronoUnit.YEARS.between(StartDate,EndDate);
            switch(Gender){
                case("Male"):
                    System.out.println("Name : " + Name);
                    if(age<18){
                        System.out.println("Not Eligible for Voting");
                        System.out.println("Booth Number : Nil");
                    }
                    else if(age>=18 && age<=30){
                        System.out.println("Eligible for Voting");
                        System.out.println("Booth Number : 1");
                    }
                    else if(age>=31 && age<=60){
                        System.out.println("Eligible for Voting");
                        System.out.println("Booth Number : 2");
                    }
                    else{
                        System.out.println("Eligible for Voting");
                        System.out.println("Booth Number : 3");
                    }
                    break;
                case("Female"):
                    System.out.println("Name : " + Name);
                    if(age<18){
                        System.out.println("Not Eligible for Voting");
                        System.out.println("Booth Number : Nil");
                    }
                    else if(age>=18 && age<=45){
                        System.out.println("Eligible for Voting");
                        System.out.println("Booth Number : 4");
                    }
                    else if(age>=46 && age>=60){
                        System.out.println("Eligible for Voting");
                        System.out.println("Booth Number : 5");
                    }
                    else{
                        System.out.println("Eligible for Voting");
                        System.out.println("Booth Number : 3");
                    }
                    break;
                case("Transgender"):
                    System.out.println("Name : " + Name);
                    if(age<18){
                        System.out.println("Not Eligible for Voting");
                        System.out.println("Booth Number : Nil");
                    }
                    else{
                        System.out.println("Eligible for Voting");
                        System.out.println("Booth Number : 4");
                    }
                    break;
            }
        }
    }
}