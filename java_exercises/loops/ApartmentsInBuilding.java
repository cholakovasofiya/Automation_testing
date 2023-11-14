package com.loops;

public class ApartmentsInBuilding {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i==8){
                continue;
            }
            System.out.println("Apartment "+i+" is sold.");
        }
    }
}
