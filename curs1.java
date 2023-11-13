import utils.utils;

public class curs1 {
    public static void main (String[] args){

        // tema 3
        int x = 5;
        int y = 10;
        System.out.println("Tema 3 rezultat: " + utils.adunare(x,y));

        // tema 4
        x = 20;
        float f = 10;
        String s = "java";
        System.out.println("Tema 4 rezultat: int is " + x + " float is " + f + " string is " + s);

        // tema 5
        System.out.println("Tema 5 rezultat: " + utils.inmultire(x, y));

        // tema 6
        int[] pretBile = new int[]{3,4,5};
        int rezultat = 0;
        for (int j : pretBile) {
            rezultat += j;
        }
        System.out.println("Tema 6 rezultat: " + rezultat);

        // tema 7
        x = 142;
        double d = 9.38;
        double rez = x + d;
        System.out.println("Tema 7 rezultat: " + rez);

        // tema 8
        String nume = "numele";
        String prenumele = "prenumele";
        String fullName = nume + prenumele;
        System.out.println("Tema 8 rezultat: " + fullName.length());

        // tema 9
        int lungime = 10;
        int latime = 2;
        System.out.println("Tema 9 rezultat: " + utils.inmultire(lungime,latime));

        // tema 10
        String sir = "Eu merg la mare";
        System.out.println("Tema 10 rezultat: " + sir.length());

        // tema 11
        String ana = "Ana are mere";
        System.out.println("Tema 11 rezultat: " + ana.substring(3));

        // tema 12
        String coral = "Coral is either the stupidest animal or the smartest rock";
        int xx = 7;
        System.out.println("Tema 12 rezultat: " + coral.substring(0, coral.length() - xx));

        // tema 13
        System.out.println("Tema 13 rezultat: " + coral.substring(0,5) + coral.substring(coral.length() - 5));

        // tema 14
        int count = 0;
        String the = "the";
        String[] split = coral.split(" ");
        for(String cuv : split){
            if(cuv.equals(the)){
                count++;
            }
        }
        System.out.println("Tema 14 rezultat: " + count);

        // tema 15
        System.out.println("Tema 15 rezultat: " + coral.replaceAll(the, the.toUpperCase()));
        System.out.println("sau:" + coral.replaceAll("\\b" + the + "\\b", the.toUpperCase()));
    }
}
