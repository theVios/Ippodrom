public class Ippodrom {

    public static void main(String[] args) {
        System.out.println("rase is start");
        Horses horse1 = new Horses("Isabella", 1);
        Horses horse2 = new Horses("Tadgik", 2);
        Horses horse3 = new Horses("Adgik", 3);
        Thread Isabella = new Thread(horse1);
        Thread Tadgik = new Thread(horse2);
        Thread Adgik = new Thread(horse3);
        Isabella.start();
        Tadgik.start();
        Adgik.start();
//        while(Isabella.isAlive()&& Tadgik.isAlive()&& Adgik.isAlive()){
//        }
//        if (!Isabella.isAlive()){
//            System.out.println("Isabella - finiched first");
//        }
//        else if(!Tadgik.isAlive()){
//            System.out.println("Tadgik - finiched first");
//        }
//        else{
//            System.out.println("Adgik - finiched fist");
//        }
//        System.out.println("rase is over");
//        }

    }
}
