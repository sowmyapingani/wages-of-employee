package com.bridgelabs.java;
import java.util.Random;
public class employeeWages1 {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
                Random random  = new Random();
                int attendance = random.nextInt(2);
                int wagePerHour=20;
                int fullDayHours=8;
                int partTimeHours=4;
                int wagePerDay=0;

                switch(attendance)
                {
                    case 0: System.out.println("Employee Absent");
                        break;
                    case 1: wagePerDay = partTimeHours * wagePerHour;
                        break;
                    default:
                        wagePerDay =wagePerHour * fullDayHours;
                }
                if(attendance == 1) {
                    System.out.println("Employee Present");
                    wagePerDay = wagePerHour * fullDayHours;
                }
                else
                    System.out.println("Employee Absent");
                System.out.println("Employee Wage Per Day:" + wagePerDay);
            }
        }