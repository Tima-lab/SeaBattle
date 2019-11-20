package Model;
import Model.GamePole;

public class User {
    private GamePole gamePole = new GamePole();

    public User(){
        AddShips();
    }

    private void AddShips() {
        gamePole.getShips()[0] = new Ship(0,0,"Восток", 4);
        gamePole.CreateShip(0);
        gamePole.getShips()[1] = new Ship(9,0,"Юг", 3);
        gamePole.CreateShip(1);
        gamePole.getShips()[2] = new Ship(0, 2, "Восток", 3);
        gamePole.CreateShip(2);
        gamePole.getShips()[3] = new Ship(8,3, "Запад", 2);
        gamePole.CreateShip(3);
        gamePole.getShips()[4] = new Ship(0,9,"Север",2);
        gamePole.CreateShip(4);
        gamePole.getShips()[5] = new Ship(3,8,"Север",2);
        gamePole.CreateShip(5);
        gamePole.getShips()[6] = new Ship(5,9,"Юг",1);
        gamePole.CreateShip(6);
        gamePole.getShips()[7] = new Ship(5,0,"Юг",1);
        gamePole.CreateShip(7);
        gamePole.getShips()[8] = new Ship(7,1,"Юг",1);
        gamePole.CreateShip(8);
        gamePole.getShips()[9] = new Ship(2,6,"Юг",1);
        gamePole.CreateShip(9);
    }

    public GamePole getGamePole() {
        return gamePole;
    }
}
