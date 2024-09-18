package com.udemy;

public class CodeExerciseBytesConverter {
    public static void printMegaBytesAndKiloByte (int kiloBytes){

        int megaBytes = kiloBytes / 1024;
        int remainder = kiloBytes % 1024;
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        }else{
            System.out.printf("%d KB = %d MB and %d KB", kiloBytes,megaBytes,remainder);

        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloByte(-1024);
    }

}
