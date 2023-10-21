import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter weight in kg:");
        float weight = sc.nextFloat();
        System.out.println("enter height in cm:");
        float height = sc.nextFloat();

        float bmi = (100*100*weight)/(height*height); //body mass index calculator
        
        if(18.5 > bmi){
            System.out.println("underweight:" +bmi);
        }
        else if(18.5<= bmi && 24.9>= bmi){
            System.out.println("normal weight :" +bmi);
        }
        else if(25.0 <= bmi && 29.9 >= bmi){
            System.out.println("pre obesity :" +bmi);
        }
        else if(30.0 <= bmi && 24.9 >= bmi){
            System.out.println("obesity class 1:" +bmi);
        }
        else if(35.0<= bmi && 39.9>= bmi){
            System.out.println("obesity class 2:" +bmi);
        }
        else if(bmi<40){
            System.out.println("obesity class 3:"+bmi);
        
        }
        else{
            System.out.println("wrong choice");
        }

    }
}
