package edu.vanier.eastwest.models;

import javafx.geometry.Point3D;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Sphere;

public class Body extends Sphere {

    private double mass, radius;
    private Point3D position, velocity, acceleration;
    private ImagePattern sprite;

    /**
     * Constructor for a Body object using 4 parameters.
     * @param radius The radius of the Sphere
     * @param mass The mass of the body
     * @param position The position of the body in the space
     * @param color The color of the object
     */
    public Body(double radius, double mass, Point3D position, Color color) {
        super(radius);
        this.mass = mass;
        setPosition(position);
        velocity = new Point3D(0, 0 , 0);
        acceleration = new Point3D(0, 0, 0);
        setMaterial(new PhongMaterial(color));
    }

    /**
     * Updates the velocity of the Body object instance.
     * @param time The time that passes
     * @param acceleration The acceleration of the body
     */
    public void update(double time, Point3D acceleration){
        // Update position
        setPosition(getPosition().add(velocity.multiply(time)));

        // Update velocity
        velocity = velocity.add(acceleration.multiply(time));
    }

    /**
     * Updates the position of the Body object instance.
     * @param position The current x, y, z position of the body.
     */
    public void setPosition(Point3D position) {
        setTranslateX(position.getX());
        setTranslateY(position.getY());
        setTranslateZ(position.getZ());
    }

    //TODO lombok
    public Point3D getPosition() {
        return new Point3D(getTranslateX(), getTranslateY(), getTranslateZ());
    }

    //TODO lombok
    public void setVelocity(Point3D velocity) {
        this.velocity = velocity;
    }

    //TODO lombok
    public Point3D getVelocity() {
        return velocity;
    }

    //TODO lombok
    public double getMass() {
        return mass;
    }

    @Override
    public String toString() {
        return "Body{" +
                "mass=" + mass +
                ", radius=" + radius +
                ", position=" + position +
                ", velocity=" + velocity +
                '}';
    }
}
