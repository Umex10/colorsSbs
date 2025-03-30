package at.fhj.msd;


public class App {
    public static void main(String[] args) {

        Color c1 = new Color(2, 255, 0);
        System.out.printf("rgb: %s\n",c1.rgbFormat());
        System.out.printf("rgb: %s\n", c1.hexFormat());

        System.out.printf("rgb with ToString(): %s\n",c1.toString());

        Color c2 = new Color(2, 255, 0);

        Color c3 = new Color(2,200,5);

        System.out.printf("c1 = c2? --> %b\n", c1.equals(c2));
        System.out.printf("c1 = c3? --> %b\n", c1.equals(c3));
        System.out.printf("c2 = c3? --> %b", c2.equals(c3));


    }
}
