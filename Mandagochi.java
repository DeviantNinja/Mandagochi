public class Mandagochi {
    private int hungriness;
    private int tiredness;
    private int happiness;
    private int cleanness;

    public Mandagochi() {
        hungriness = 0;
        tiredness = 0;
        happiness = 5;
        cleanness = 10;
    }

    public void passtime() {
        happiness -= 1;
        cleanness -= 2;
        tiredness += 1;
        hungriness += 2;
    }

    public void play() {
        happiness += 3;
        tiredness += 2;
        
        
        if(happiness > 10) {
            happiness = 10;
        }

        if(tiredness > 10) {
            tiredness = 10;
        }
    }

    public void giveSnack() {
        hungriness += 5;
        tiredness -= 1;

        if(hungriness < 10 ) {
            hungriness = 0;
        }

        if(tiredness < 0) {
            tiredness = 0;
        }
    }

    public void clean() {
        cleanness = 0;
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

        if(cleanness > 7) {
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
