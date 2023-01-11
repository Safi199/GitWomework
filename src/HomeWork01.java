import java.util.Scanner;
public class HomeWork01 {
    public static void main(String[]args){

        Scanner uinp = new Scanner(System.in);
        double height;

        System.out.println("Enter person's height in inches");
        height = uinp.nextDouble();

        if(height <60 ){

            System.out.println("Short");

        }else if(height >= 60 &&  height <= 72){
            System.out.println("Medium");
        }else{
            System.out.println("Tall");
        }




    }
}
