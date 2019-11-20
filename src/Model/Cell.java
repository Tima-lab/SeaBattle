package Model;

public class Cell {
    private int x;
    private int y;
    private int status_cell;
    private boolean check;

    public Cell(int x, int y, boolean check,int status_cell) {
        setX(x);
        setY(y);
        setCheck(check);
        setStatus_cell(status_cell);
    }

    public int getStatus_cell() {
        return status_cell;
    }

    public void setStatus_cell(int status_cell) {
        this.status_cell = status_cell;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
