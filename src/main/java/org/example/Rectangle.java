package main.java.org.example;

public class Rectangle {
    private int height;
    private int width;

    public Rectangle(int initialHeight, int initialWidth) {
        height = initialHeight;
        width = initialWidth;
    }

    public int calculateArea() {
        return height * width;
    }

    public void setHeight(int newHeight) {
        height = newHeight;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int newWidth) {
        width = newWidth;
    }

    public int getWidth() {
        return width;
    }
}
