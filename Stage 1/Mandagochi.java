import java.util.Timer;
import java.util.TimerTask;


public class Mandagochi {
    private int hungriness;
    private int tiredness;
    private int happiness;
    private int cleanness;

    public Mandagochi() {

        System.out.println("Mandagochi Started");

        hungriness = 0;
        tiredness = 0;
        happiness = 7;
        cleanness = 10;

        TimerTask gameTask = new TimerTask() {

            @Override
            public void run() {
                passtime();
            }
            
        };

        Timer gameLoop = new Timer();

        gameLoop.scheduleAtFixedRate(gameTask, 0, 1000 * 2);


    }

    public void passtime() {
        happiness -= 1;
        cleanness -= 2;
        tiredness += 1;
        hungriness += 2;
    }

    public void fixStats() {
        if(happiness > 10) 
            happiness = 10;

        if(cleanness > 10) 
           cleanness = 10;

        if(tiredness > 10) 
            tiredness = 10;

        if(hungriness > 10) 
            hungriness = 10;

        if(happiness < 0) 
            happiness = 0;

        if(cleanness < 0) 
            cleanness = 0;

        if(tiredness < 0) 
            tiredness = 0;

        if(hungriness < 0) 
            hungriness = 0;

    }

    public void getStats(){
        System.out.println("hungriness: "+ hungriness);
        System.out.println("tiredness: "+ tiredness);
        System.out.println("happiness: "+ happiness);
        System.out.println("cleanness: "+ cleanness);

    }

    public void play() {
        happiness += 3;
        tiredness += 2;
        
    }

    public void giveSnack() {
        hungriness += 5;
        tiredness -= 1;

    }

    public void clean() {
        cleanness = 10;
    }

    public String getMood() { 

        if(tiredness > 7) {
            if(cleanness <3) {
                return "is tired, but needs a bath first";
            } else {
                return "is tired and is going to take a nap";
            }
        }
        
        if(hungriness > 6) {
            return "could use a snack";
        }

        if(cleanness <= 3) {
            return "requires a bath";
        }

        if(happiness > 7) {
            return "is happy";
        } else if ( happiness >= 4) {
            return "is okay";
        } else {
            return "is sad";
        }
    }

}
