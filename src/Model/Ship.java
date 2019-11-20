package Model;

public class Ship {
    private int x_begin, y_begin;
    private String direction;
    private int size;

    Ship(int x_begin, int y_begin, String direction, int size) {
        setX_begin(x_begin);
        setY_begin(y_begin);
        setDirection(direction);
        setSize(size);
    }

    public int getY_begin() {
        return y_begin;
    }

    public int getX_begin() {
        return x_begin;
    }

    public void setX_begin(int x_begin) {
        this.x_begin = x_begin;
    }

    public void setY_begin(int y_begin) {
        this.y_begin = y_begin;
    }

    public int getSize() {
        return size;
    }

    public String getDirection() {
        return direction;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

}
