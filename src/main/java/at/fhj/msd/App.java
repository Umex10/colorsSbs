package at.fhj.msd;


public class App {
    public static void main(String[] args) {

        Color c1 = new Color(2, 255, 0);
        System.out.println(c1.rgbFormat());
        System.out.println(c1.hexFormat());

        System.out.println(c1.toString());

    }
}
