import java.util.Scanner;
public class Latihan5soal1{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    String nilai = input.nextLine();

     switch(nilai){
                case "A":
                    System.out.println("Excellent");
                    break;
                case "B":
                    System.out.println("Good");
                    break;
                case "C":
                    System.out.println("Average");
                    break;
                case "D":   
                    System.out.println("Fail");   
                    break;       
            }
    
        }
    }