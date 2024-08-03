import java.util.Scanner;

public class Game {

   
    Mandagochi boss; 

    public Game(){
        System.out.println("Game Started");
    
        boss = new Mandagochi();
        
/*         while(true) {
            boss.getStats();
            System.out.println(boss.getMood());

            ;
        } */
        while (true) {
            boss.fixStats();
            boss.getStats();
            menu();  
            System.out.println("********");
        }
        

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
            System.out.println("while start "+question);

            question = input.nextInt();
          
        }

        //input.close();

        if(question == 1) {
            boss.play();
            System.out.println("played");
        } 
            
        if (question == 2) {
            boss.giveSnack();
            System.out.println("ate");
        } 
            
        if (question ==3) {
            boss.clean();
            System.out.println("cleaned");
        } 

    }
}


