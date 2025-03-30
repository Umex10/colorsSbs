package at.fhj.msd;


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

}
