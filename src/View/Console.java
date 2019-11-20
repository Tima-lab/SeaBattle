package View;

import Model.Game;

public class Console {
    public Console() {

        Game game = new Game();

        System.out.println("         User1             *              User2");
        for (int i = 0; i < 10; i++){
            // Верхняя полоса поля игрока
            if (i == 0) System.out.println("______________________     *     ______________________");
            for (int j = 0; j < 10; j++) {
                // Левая граница поля игрока
                if (j == 0) System.out.print("|");
                System.out.print(game.getUser1().getGamePole().getCells()[i][j].getStatus_cell() + " ");
                // Правая граница поля игрока
                if (j == 9) {
                    System.out.print("|     *     |");
                    for (int k = 0; k < 10; k++){
                        System.out.print(game.getUser2().getGamePole().getCells()[i][k].getStatus_cell() + " ");
                        if (k == 9) System.out.print("|\n");
                    }

                }
            }
            if (i == 9) System.out.println("======================     *     ======================");
        }
    }
}
