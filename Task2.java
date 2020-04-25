package by.belhard.j22.homeworks;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {

Scanner s=new Scanner(System.in);
System.out.println("Задайте температуру");
int temperature=s.nextInt();
if (temperature<10){
        System.out.println("Наденьте куртку");}
        else if (temperature>=10&&temperature<=15){
            System.out.println("Наденьте ветровку");
        }
        else if (temperature>=16&&temperature<=20){
            System.out.println("Наденьте свитер");
        }
        else if (temperature>=21&&temperature<=30){
            System.out.println("Наденьте майку");
        }

         else if (temperature>30){
        System.out.println("Ничего не одевайте");
        }

}


    }

