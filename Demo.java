
class Computer {
    public void playMusic() {
        System.out.println("Music play");
    }

    public String getMeApen(int cost) {
        if (cost >= 10)
            return "Pen";
        else
            return "None";
    }
}

public class Demo {
    public static void main(String[] args) {
        Computer obj = new Computer();
        
        obj.playMusic();   // correct method call

        String str = obj.getMeApen(2);  // correct argument passing
        System.out.println(str);
    }
}