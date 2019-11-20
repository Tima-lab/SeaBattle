package Model;
import Model.Ship;

public class GamePole {
    private Cell[][] cells = new Cell[10][10];
    private Ship[] ships = new Ship[10];


    public GamePole() {
        GenerateEmptyGamePole(10,10);
    }

    public void GenerateEmptyGamePole(int size_x, int size_y) {
        for (int i = 0; i < size_x; i++) {
            for (int j = 0; j < size_y; j++) {
                getCells()[i][j] = new Cell(j, i,false, 0);
            }
        }
    }

    public void CreateShip(int j){
        switch (ships[j].getDirection()) {
            case "Север":
                for (int i = 0; i < ships[j].getSize(); i++)
                    cells[ships[j].getY_begin()-i][ships[j].getX_begin()] = new Cell(ships[j].getY_begin(), ships[j].getX_begin()-i, true, 1);
                break;
            case "Юг":
                for (int i = 0; i < ships[j].getSize(); i++)
                    cells[ships[j].getY_begin()+i][ships[j].getX_begin()] = new Cell(ships[j].getY_begin(), ships[j].getX_begin()+i, true, 1);
                break;
            case "Запад":
                for (int i = 0; i < ships[j].getSize(); i++)
                    cells[ships[j].getY_begin()][ships[j].getX_begin()-i] = new Cell(ships[j].getY_begin()-i, ships[j].getX_begin(), true, 1);
                break;
            case "Восток":
                for (int i = 0; i < ships[j].getSize(); i++)
                    cells[ships[j].getY_begin()][ships[j].getX_begin()+i] = new Cell(ships[j].getY_begin()+i, ships[j].getX_begin(), true, 1);
                break;
        }
    }


    public Cell[][] getCells() {
        return this.cells;
    }

    public Ship[] getShips() {
        return ships;
    }
}
