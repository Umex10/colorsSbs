package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Color {

    public int red;
    public int green;
    public int blue;

    public Color(int red, int green, int blue) {

        if ((red < 0 || green < 0 || blue < 0) || (red > 255 || green > 255 || blue > 255)) {

            throw new IllegalArgumentException("Invalid values for the base colors");
        }

        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    //? Constructor
    public int getRed() {
        return this.red;
    }

    public int getGreen() {
        return this.green;
    }

    public int getGetBlue() {
        return this.blue;
    }

    public String hexFormat() {
        return String.format("#%02x%02x%02x", this.red, this.green, this.blue).toUpperCase();
    }

    public String rgbFormat() {
        return String.format("rgb(%d, %d, %d)", this.red, this.green, this.blue);
    }

    @Override
    public String toString() {
        return this.rgbFormat();
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {

            return true;
        }
        if (!(obj instanceof Color)) {
            return false;
        }

        Color other = (Color) obj;
        return this.red == other.red && this.green == other.green && this.blue == other.blue;
    }

    static Random rnd = new Random();

    public static List<Color> randomColors(int amount) {

        List<Color> randomColors = new ArrayList<>();

        for (int i = 0; i < amount; i++) {
            int red = rnd.nextInt(256);
            int green = rnd.nextInt(256);
            int blue = rnd.nextInt(256);

            Color c = new Color(red, green, blue);

            randomColors.add(c);
        }

        return randomColors;
    }

    public static List<Color> uniqColors(List<Color> randomColors) {

        List<Color> uniqColors = new ArrayList<>();
        boolean isIn = false;

        for (int i = 0; i < randomColors.size(); i++) {

            for (int u = 0; u < uniqColors.size(); u++) {
                if (uniqColors.get(u).equals(randomColors.get(i))) {
                    isIn = true;
                    break;
                }
            }
            if (!isIn) {
                uniqColors.add(randomColors.get(i));
            }
            isIn = false;
        }

        return uniqColors;
    }

    public static List<Color> uniqColors2(List<Color> randomColors) {

        List<Color> uniqColors = new ArrayList<>();

        for (Color color : randomColors) {

            if (!uniqColors.contains(color)) {
                uniqColors.add(color);
            }
        }

        return uniqColors;
    }


    @Override

    public int hashCode() {

       return this.hexFormat().hashCode();
        
    }
}
