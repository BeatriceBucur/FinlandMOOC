package week4.rollingTheDice;

public class ex80Roller {
    public static void main(String[] args) {

        ex80Dice dice  = new ex80Dice(6);

        int i = 0;
        while ( i<10){
            System.out.println(dice.roll());
            i++;
        }
    }
}
