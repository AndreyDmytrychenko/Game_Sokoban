package com.javarush.task.task34.task3410.model;

abstract public class CollisionObject extends GameObject {
    public CollisionObject(int x, int y) {
        super(x, y);
    }

    public boolean isCollision(GameObject gameObject, Direction direction) {
        return switch (direction) {
            case LEFT -> ((x - Model.FIELD_CELL_SIZE) == gameObject.getX()) && (y == gameObject.getY());
            case RIGHT -> ((x + Model.FIELD_CELL_SIZE) == gameObject.getX()) && (y == gameObject.getY());
            case UP -> ((x == gameObject.getX() && (y - Model.FIELD_CELL_SIZE) == gameObject.getY()));
            case DOWN -> ((x == gameObject.getX() && (y + Model.FIELD_CELL_SIZE) == gameObject.getY()));
        };
    }
}
