package com.csc205.project2;

/*
ChatGPT extra credit:

write volume and surfaceArea methods in java for a cube, a cylinder, and a torus
        note - I have no idea how this worked straight out the box so well... All I did was write this line, and it spat out exactly what I needed.
        I was expecting to have to tweak variable names for each individually but it all works perfectly.
 */
public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double height, double radius) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height; // Volume of a cylinder.
    }

    @Override
    public double surfaceArea() {
        double lateralSurfaceArea = 2 * Math.PI * radius * height; // Lateral surface area of a cylinder.
        double baseArea = 2 * Math.PI * Math.pow(radius, 2); // Two circular bases.
        return lateralSurfaceArea + baseArea;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cylinder{");
        sb.append("height=").append(height);
        sb.append(", radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}

