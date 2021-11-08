import java.util.ArrayList;
import java.util.Scanner;


class Game {

    public static void main(String[] args) {
        int score = 0, swap, n, m, randomNullIndex;
        boolean continueGame = true;
        int[][] gameBoard = new int[4][4];

        Scanner scanner = new Scanner(System.in);
        n = (int) (Math.random() * 4);
        m = (int) (Math.random() * 4);
        gameBoard[n][m] = 2;

        ArrayList<Integer> saverOfNullIndex = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (gameBoard[i][j] == 0) {
                    saverOfNullIndex.add(i * 10 + j);
                }
            }
        }
        randomNullIndex = (int) (Math.random() * saverOfNullIndex.size() + 1);
        n = saverOfNullIndex.get(randomNullIndex - 1) / 10;
        m = saverOfNullIndex.get(randomNullIndex - 1) % 10;
        gameBoard[n][m] = 2;

        System.out.println("Welcome to the 2048 game!");
        System.out.println("w - up, s - down, a - left, d - right.");
        System.out.println();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(gameBoard[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
            while (continueGame) {
                continueGame = false;
                String step = scanner.nextLine();

                switch (step) {
                    case "s":
                        for (int j = 0; j < 4; j++) {
                            for (int i = 0; i < 4; i++) {
                                if (gameBoard[i][j] != 0) {
                                    for (int k = 0; k < 3; k++) {
                                        if (gameBoard[k + 1][j] == 0) {
                                            swap = gameBoard[k][j];
                                            gameBoard[k][j] = 0;
                                            gameBoard[k + 1][j] = swap;
                                        } else if (gameBoard[k + 1][j] == gameBoard[k][j]) {
                                            gameBoard[k + 1][j] = gameBoard[k + 1][j] * 2;
                                            gameBoard[k][j] = 0;
                                            score += gameBoard[k + 1][j];
                                        }
                                    }
                                }
                            }
                        }
                        System.out.println("Score: " + score);
                        System.out.println();
                        saverOfNullIndex.clear();
                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {
                                if (gameBoard[i][j] == 0) {
                                    saverOfNullIndex.add(i * 10 + j);
                                    continueGame = true;
                                }
                            }
                        }
                        if (saverOfNullIndex.size() != 0) {
                            randomNullIndex = (int) (Math.random() * saverOfNullIndex.size() + 1);
                            n = saverOfNullIndex.get(randomNullIndex - 1) / 10;
                            m = saverOfNullIndex.get(randomNullIndex - 1) % 10;
                            gameBoard[n][m] = 2;
                        }
                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {
                                System.out.print(gameBoard[i][j]);
                                System.out.print("\t");
                            }
                            System.out.println();
                        }
                        break;

                    case "a":
                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {
                                if (gameBoard[i][j] != 0) {
                                    for (int k = j; k > 0; k--) {
                                        if (gameBoard[i][k - 1] == 0) {
                                            swap = gameBoard[i][k];
                                            gameBoard[i][k] = 0;
                                            gameBoard[i][k - 1] = swap;
                                        } else if (gameBoard[i][k - 1] == gameBoard[i][k]) {
                                            gameBoard[i][k - 1] = gameBoard[i][k - 1] * 2;
                                            gameBoard[i][k] = 0;
                                            score += gameBoard[i][k - 1];
                                        }
                                    }
                                }
                            }
                        }
                        System.out.println("Score: " + score);
                        System.out.println();
                        saverOfNullIndex.clear();
                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {
                                if (gameBoard[i][j] == 0) {
                                    saverOfNullIndex.add(i * 10 + j);
                                    continueGame = true;
                                }
                            }
                        }
                        if (saverOfNullIndex.size() != 0) {
                            randomNullIndex = (int) (Math.random() * saverOfNullIndex.size() + 1);
                            n = saverOfNullIndex.get(randomNullIndex - 1) / 10;
                            m = saverOfNullIndex.get(randomNullIndex - 1) % 10;
                            gameBoard[n][m] = 2;
                        }
                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {
                                System.out.print(gameBoard[i][j]);
                                System.out.print("\t");
                            }
                            System.out.println();
                        }
                        break;

                    case "w":
                        for (int j = 0; j < 4; j++) {
                            for (int i = 0; i < 4; i++) {
                                if (gameBoard[i][j] != 0) {
                                    for (int k = i; k > 0; k--) {
                                        if (gameBoard[k - 1][j] == 0) {
                                            swap = gameBoard[k][j];
                                            gameBoard[k][j] = 0;
                                            gameBoard[k - 1][j] = swap;
                                        } else if (gameBoard[k - 1][j] == gameBoard[k][j]) {
                                            gameBoard[k - 1][j] = gameBoard[k - 1][j] * 2;
                                            gameBoard[k][j] = 0;
                                            score += gameBoard[k - 1][j];
                                        }
                                    }
                                }
                            }
                        }
                        System.out.println("Score: " + score);
                        System.out.println();
                        saverOfNullIndex.clear();
                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {
                                if (gameBoard[i][j] == 0) {
                                    saverOfNullIndex.add(i * 10 + j);
                                    continueGame = true;
                                }
                            }
                        }
                        if (saverOfNullIndex.size() != 0) {
                            randomNullIndex = (int) (Math.random() * saverOfNullIndex.size() + 1);
                            n = saverOfNullIndex.get(randomNullIndex - 1) / 10;
                            m = saverOfNullIndex.get(randomNullIndex - 1) % 10;
                            gameBoard[n][m] = 2;
                        }
                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {
                                System.out.print(gameBoard[i][j]);
                                System.out.print("\t");
                            }
                            System.out.println();
                        }
                        break;

                    case "d":
                        for (int i = 0; i < 4; i++) {
                            for (int j = 3; j >= 0; j--) {
                                if (gameBoard[i][j] != 0) {
                                    for (int k = j; k < 3; k++) {
                                        if (gameBoard[i][k + 1] == 0) {
                                            swap = gameBoard[i][k];
                                            gameBoard[i][k] = 0;
                                            gameBoard[i][k + 1] = swap;
                                        } else if (gameBoard[i][k + 1] == gameBoard[i][k]) {
                                            gameBoard[i][k + 1] = gameBoard[i][k + 1] * 2;
                                            gameBoard[i][k] = 0;
                                            score += gameBoard[i][k + 1];
                                        }
                                    }
                                }
                            }
                        }
                        System.out.println("Score: " + score);
                        System.out.println();
                        saverOfNullIndex.clear();
                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {
                                if (gameBoard[i][j] == 0) {
                                    saverOfNullIndex.add(i * 10 + j);
                                    continueGame = true;
                                }
                            }
                        }
                        if (saverOfNullIndex.size() != 0) {
                            randomNullIndex = (int) (Math.random() * saverOfNullIndex.size() + 1);
                            n = saverOfNullIndex.get(randomNullIndex - 1) / 10;
                            m = saverOfNullIndex.get(randomNullIndex - 1) % 10;
                            gameBoard[n][m] = 2;
                        }
                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {
                                System.out.print(gameBoard[i][j]);
                                System.out.print("\t");
                            }
                            System.out.println();
                        }
                        break;
                }
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (gameBoard[i][j] == gameBoard[i][j + 1]) {
                            continueGame = true;
                            break;
                        }
                    }
                }
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 4; j++) {
                        if (gameBoard[i][j] == gameBoard[i + 1][j]) {
                            continueGame = true;
                            break;
                        }
                    }
                }
            }
        System.out.println("Game over!");
        System.out.println("Your score: " + score);
    }
}

