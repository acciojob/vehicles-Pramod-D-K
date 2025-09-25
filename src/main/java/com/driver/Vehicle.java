package com.driver;

public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currentDirection;
    public Vehicle(){
    }
    public Vehicle(String name) {
        this.name=name;
        this.currentDirection=0;
        this.currentSpeed=0;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getCurrentDirection() {
        return currentDirection;
    }
    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }
    public int getCurrentSpeed() {
        return currentSpeed;
    }
    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void steer(int direction){
        //direction is in degrees, add it to the current direction
        currentDirection=(this.currentDirection+direction)%360;
        System.out.println("steer method called - The direction is changed to: " + this.currentDirection + " degrees");
    }

    public void move(int speed, int direction){
        //set the values of currentSpeed and currentDirection
        currentSpeed=this.currentSpeed+speed;
        currentDirection=(this.currentDirection+direction)%360;
        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }
    public void stop(){
        System.out.println("stop method called - The vehicle is stopped");
    }
}
