public class Pet {
    private int happiness, tiredness, hungriness, cleanness;
    
    public Pet(){
        tiredness = 0;
        hungriness = 0;
        cleanness = 10;
        happiness = 5;
    }

    public int getTiredness(){
        return tiredness;
    }

    public int getHungriness(){
        return hungriness;
    }

    public int getCleanness(){
        return cleanness;
    }

    public int getHappiness(){
        return happiness;
    }

    public void gameTick(){
        happiness--;
        hungriness++;
        tiredness++;
        cleanness--;

        if(tiredness > 10) {
            tiredness = 10;
        }

        if(happiness > 10) {
            happiness = 10;
        }

        if(cleanness < 0) {
            cleanness = 0;
        }

        if(hungriness > 10) {
            hungriness = 10;
        }
    }

    public void play(){
        tiredness++;
        happiness++;
        hungriness++;
        cleanness--;

        if(tiredness > 10) {
            tiredness = 10;
        }

        if(happiness > 10) {
            happiness = 10;
        }

        if(cleanness < 0) {
            cleanness = 0;
        }

        if(hungriness > 10) {
            hungriness = 10;
        }
    }

    public void feed(){

        hungriness--;

        if(hungriness < 0) {
            hungriness = 0;
        }
    }

    public void clean(){
        cleanness = 10;
    }

    public void getState(){

    }

    public void getStats(){
        System.out.println("hungriness " + hungriness);
        System.out.println("tiredness " + tiredness);
        System.out.println("cleanness " + cleanness);
        System.out.println("happiness " + happiness);
    }
}
