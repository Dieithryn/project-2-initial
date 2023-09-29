package com.csc205.project2;

/*
ChatGPT extra credit:

write volume and surfaceArea methods in java for a cube, a cylinder, and a torus
        note - I have no idea how this worked straight out the box so well... All I did was write this line, and it spat out exactly what I needed.
        I was expecting to have to tweak variable names for each individually but it all works perfectly.
 */
public class Torus extends Shape{
    private double majorRadius; // Radius from center of tube to center of torus.
    private double minorRadius; // Radius of the tube.
    private boolean eaten; // Whether the torus has been eaten or not.

    public Torus(double majorRadius, double minorRadius) {
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }
    @Override
    public double volume() {
        return 2 * Math.PI * Math.PI * majorRadius * Math.pow(minorRadius, 2); // Volume of a torus.
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(majorRadius, 2); // Surface area of a torus.
    }
    public void eat(){
        eaten = true;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Torus{");
        sb.append("majorRadius=").append(majorRadius);
        sb.append(", minorRadius=").append(minorRadius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append(", eaten=").append(eaten);
        sb.append('}');
        return sb.toString();
    }
}
