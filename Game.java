import java.util.Scanner;

public class Game {

   
    Mandagochi boss; 

    public Game(){
        System.out.println("Game Started");
    
        boss = new Mandagochi();
        
        boss.getStats();
        System.out.println(boss.getMood());

        
    }

    private void menu(){

        Scanner input = new Scanner(System.in);

        int question = 0;

        System.out.println("1. Play");
        System.out.println("2. Feed");
        System.out.println("3. Clean");
        
        System.out.print("Please Choose: ");

        while (question != 1 && question != 2 && question != 3) {

            while(!input.hasNextInt()) {
                System.out.print("try Again: ");
                input.next();
            }

            question = input.nextInt();
            input.close();
        }



        if(question == 1) {
            boss.play();
        } 
            
        if (question == 2) {
            boss.giveSnack();
        } 
            
        if (question ==3) {
            boss.clean();
        } 

    }
}


