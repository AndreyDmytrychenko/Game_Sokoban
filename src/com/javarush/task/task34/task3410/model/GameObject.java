package com.javarush.task.task34.task3410.model;

import java.awt.*;

public abstract class GameObject {

    public int x;
    public int y;
    public int width = Model.FIELD_CELL_SIZE;
    public int height = Model.FIELD_CELL_SIZE;

    public GameObject(int x, int y, int weight, int height) {
        this.x = x;
        this.y = y;
        this.width = weight;
        this.height = height;
    }

    public GameObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public abstract void draw(Graphics graphics);
}
