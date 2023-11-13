package main;

public class Square {
    private int side;

    public Square(int initialSide) {
        side = initialSide;
    }

    public int calculateArea() {
        return side * side;
    }

    public void setSide(int newSide) {
        side = newSide;
    }

    public int getSide() {
        return side;
    }
}
