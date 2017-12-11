public class Horses implements Runnable{

    int raceTrackLong = 500;
    int location = 0;
    String name;
    int horseNumber;
    int rand = 21+(int)(Math.random()*30);
    int randTime= 101+(int)(Math.random()*300);

    public String getName() {
        return name;
    }

    public int getHorseNumber() {
        return horseNumber;
    }

    public Horses(String name, int horseNumber) {
        this.name=name;
        this.horseNumber=horseNumber;
    }

    public void run(){
            while (location < raceTrackLong) {
                location += rand;
                try {
                    Thread.sleep(randTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        System.out.println("finoished horse- "+getName());


    }





}
