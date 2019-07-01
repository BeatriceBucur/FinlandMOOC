package week1.exUpTo12;

public class ex3SpruceTree2 {
    public static void main(String[] args) {
        int randuriI = 6;
        int coloaneJ = 9;


        for (int i = 0; i < randuriI; i++) {
            for (int j = 0; j < coloaneJ; j++) {
                if (j != coloaneJ / 2) {
                    System.out.print(" _ ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println("");
            break;
        }
        for (int i = 0; i < randuriI; i++) {
            for (int j = 0; j < coloaneJ; j++) {
                if (j <= 2 || j >= 6) {
                    System.out.print(" _ ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println("");
            break;
        }
        for (int i = 0; i < randuriI; i++) {
            for (int j = 0; j < coloaneJ; j++) {
                if (j <= 1 || j >= 7) {
                    System.out.print(" _ ");
                } else {
                    System.out.print(" * ");
                }

            }
            System.out.println("");
            break;
        }
        for (int i = 0; i < randuriI; i++) {
            for (int j = 0; j < coloaneJ; j++) {
                if (j == 0 || j == coloaneJ - 1) {
                    System.out.print(" _ ");
                } else {
                    System.out.print(" * ");
                }

            }
            System.out.println("");
            break;
        }
        for (int i = 0; i < randuriI; i++) {
            for (int j = 0; j < coloaneJ; j++) {
                if (coloaneJ==9) {
                    System.out.print(" * ");
                }
            }
            System.out.println();
            break;
        }
        for (int i = 0; i < randuriI; i++) {
            for (int j = 0; j < coloaneJ; j++) {
                if (j != coloaneJ / 2) {
                    System.out.print(" _ ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println("");
            break;
        }
    }
}
