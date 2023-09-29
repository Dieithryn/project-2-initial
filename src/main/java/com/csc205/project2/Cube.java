package com.csc205.project2;

/*
ChatGPT extra credit:

write volume and surfaceArea methods in java for a cube, a cylinder, and a torus
        note - I have no idea how this worked straight out the box so well... All I did was write this line, and it spat out exactly what I needed.
        I was expecting to have to tweak variable names for each individually but it all works perfectly.
 */
public class Cube extends Shape{
    private double sideLength;

    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double volume() {
        return Math.pow(sideLength, 3);
    }

    @Override
    public double surfaceArea() {
        return 6 * Math.pow(sideLength, 2);
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cube{");
        sb.append("sideLength=").append(sideLength);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}


