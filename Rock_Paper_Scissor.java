
import java.util.*;
import java.util.Random;
public class Rock_Paper_Scissor {
    public static void main(String []args){
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey!\nAre you getting bored ?\nLet's have some fun\nWanna play Rock_Paper_Scissor with me? \nLet's Start.");
        System.out.println("Make your choice\n1. Rock\n2. Paper\n3. Scissor");
        int choice = sc.nextInt();
        System.out.println("##########************###########");
        int choiceOfCPU = rnd.nextInt(1,4);
        if(choice == 1){
            System.out.println("Your choice is Rock.");
            if(choiceOfCPU == 1){
                System.out.println("My choice is Rock.");
                System.out.println("Hey dude! it's a tie.");
            }
            else if(choiceOfCPU == 2){
                System.out.println("My choice is Paper.");
                System.out.println("Paper covered rock! \nYou lost\nBetter luck next time");
            }
            else if(choiceOfCPU == 3) {
                System.out.println("My choice is Scissor.");
                System.out.println("Rock smashed scissor! \nYou won\nYou got a big brain");
            }
        }
        else if(choice == 2){
            System.out.println("Your choice is Paper.");
            if(choiceOfCPU == 1){
                System.out.println("My choice is Rock.");
                System.out.println("Paper covered rock! \nYou won\nYou got a big brain");
            }
            else if(choiceOfCPU == 2){
                System.out.println("My choice is Paper.");
                System.out.println("Hey dude! it's a tie.");
            }
            else if(choiceOfCPU == 3) {
                System.out.println("My choice is Scissor.");
                System.out.println("Scissor cut paper! \nYou lost\nBetter luck next time");
            }
        }
        else if(choice == 3){
            System.out.println("Your choice is Scissor.");
            if(choiceOfCPU == 1){
                System.out.println("My choice is Rock.");
                System.out.println("Rock smashed scissor! \nYou lost\nBetter luck next time");
            }
            else if(choiceOfCPU == 2){
                System.out.println("My choice is Paper.");
                System.out.println("Scissor cut paper! \nYou won\nYou got a big brain");
            }
            else if(choiceOfCPU == 3) {
                System.out.println("My choice is Scissor.");
                System.out.println("Hey dude! it's a tie.");
            }
        }
        else{
            System.out.println("C'mon my friend atleast make a fair choice.");
        }
    }
}
