package week3.objectsAndArrayList;

public class Rope {

    public static void swing(){
        System.out.println("Swing ");
    }

    public void climb(){
        System.out.println("Climb ");
    }

    public static void play(){
        swing();
    }

    public static void main(String[] arg){
        Rope rope = new Rope();
        rope.play();

        Rope.play();

        Rope rope2 = null;
        rope2.play();
    }
}
