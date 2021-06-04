package co.edu.usta.tunja.Triqui.view;

import javax.swing.*;

public class triquiview {

        public static void main(String[] args) {
            String[][] MATRIX;
            String JUGADOR;
            int couter = 0;
            JOptionPane.showMessageDialog(null, "TREIQUI " +
                    "\n MAKER: Jhoan Sebastian Cardenas");
            if (JOptionPane.showOptionDialog(null, "De que tamaño quieres que sea el triqui", "TRiQUI", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{"5x5", "3x3"}, "3x3") == JOptionPane.YES_OPTION) {
                MATRIX = new String[5][5];
                for (int i = 0; i < 5; i++) {
                    for (int o = 0; o < 5; o++) {
                        MATRIX[i][o] = " - ";
                    }
                }
                JOptionPane.showMessageDialog(null, MATRIX[0][0] + MATRIX[0][1] + MATRIX[0][2] + MATRIX[0][3] + MATRIX[0][4] + "\n" +
                        MATRIX[1][0] + MATRIX[1][1] + MATRIX[1][2] + MATRIX[1][3] + MATRIX[1][4] + "\n" +
                        MATRIX[2][0] + MATRIX[2][1] + MATRIX[2][2] + MATRIX[2][3] + MATRIX[2][4] + "\n" +
                        MATRIX[3][0] + MATRIX[3][1] + MATRIX[3][2] + MATRIX[3][3] + MATRIX[3][4] + "\n" +
                        MATRIX[4][0] + MATRIX[4][1] + MATRIX[4][2] + MATRIX[4][3] + MATRIX[4][4]);
                if (JOptionPane.showOptionDialog(null, "Con cual quieres empesar", "ELIGE TU JUGADOR", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{"X", "O"}, "O") == JOptionPane.YES_OPTION) {
                    JUGADOR = "X";
                    while (couter < 25) {

                        String columna = JOptionPane.showInputDialog(null, "en que columna quieres jugar");
                        String fila = JOptionPane.showInputDialog(null, "en que fila quieres jugar");
                        MATRIX[(Integer.parseInt(fila) - 1)][(Integer.parseInt(columna) - 1)] = "X";
                        JOptionPane.showMessageDialog(null, MATRIX[0][0] + MATRIX[0][1] + MATRIX[0][2] + MATRIX[0][3] + MATRIX[0][4] + "\n" +
                                MATRIX[1][0] + MATRIX[1][1] + MATRIX[1][2] + MATRIX[1][3] + MATRIX[1][4] + "\n" +
                                MATRIX[2][0] + MATRIX[2][1] + MATRIX[2][2] + MATRIX[2][3] + MATRIX[2][4] + "\n" +
                                MATRIX[3][0] + MATRIX[3][1] + MATRIX[3][2] + MATRIX[3][3] + MATRIX[3][4] + "\n" +
                                MATRIX[4][0] + MATRIX[4][1] + MATRIX[4][2] + MATRIX[4][3] + MATRIX[4][4]);
                        int win = 0;
                        String Column;
                        String Row;

                        for (int i = 0; i < 5; i++) {
                            Row = "";
                            Column = "";
                            for (int o = 0; o < 5; o++) {
                                Row = Row + (MATRIX[o][i]);
                                if (Row.equals("XXXXX")) {
                                    win = 2;
                                }
                                if (Row.equals("OOOOO")) {
                                    win = 1;
                                }
                                Column = Column + (MATRIX[i][o]);
                                if (Column.equals("XXXXX")) {
                                    win = 2;
                                }
                                if (Column.equals("OOOOO")) {
                                    win = 1;
                                }
                            }
                        }
                        if (win == 1) {
                            JOptionPane.showMessageDialog(null, "El ganador es el jugador O, FELICITACIONES", "Ganador", JOptionPane.INFORMATION_MESSAGE);
                            System.exit(1);
                        }
                        if (win == 2) {
                            JOptionPane.showMessageDialog(null, "El ganador es el jugador X, FELICITACIONES", "Ganador", JOptionPane.INFORMATION_MESSAGE);
                            System.exit(1);
                        }

                        String Columna2 = JOptionPane.showInputDialog(null, "en que columna quieres jugar");
                        String Fila2 = JOptionPane.showInputDialog(null, "en que fila quieres jugar");
                        MATRIX[(Integer.parseInt(Fila2) - 1)][(Integer.parseInt(Columna2) - 1)] = "O";
                        JOptionPane.showMessageDialog(null, MATRIX[0][0] + MATRIX[0][1] + MATRIX[0][2] + MATRIX[0][3] + MATRIX[0][4] + "\n" +
                                MATRIX[1][0] + MATRIX[1][1] + MATRIX[1][2] + MATRIX[1][3] + MATRIX[1][4] + "\n" +
                                MATRIX[2][0] + MATRIX[2][1] + MATRIX[2][2] + MATRIX[2][3] + MATRIX[2][4] + "\n" +
                                MATRIX[3][0] + MATRIX[3][1] + MATRIX[3][2] + MATRIX[3][3] + MATRIX[3][4] + "\n" +
                                MATRIX[4][0] + MATRIX[4][1] + MATRIX[4][2] + MATRIX[4][3] + MATRIX[4][4]);
                        int win5 = 0;
                        String Column5;
                        String Row5;

                        for (int i = 0; i < 5; i++) {
                            Row5 = "";
                            Column5 = "";
                            for (int o = 0; o < 5; o++) {
                                Row5 = Row5 + (MATRIX[o][i]);
                                if (Row5.equals("XXXXX")) {
                                    win5 = 2;
                                }
                                if (Row5.equals("OOOOO")) {
                                    win5 = 1;
                                }
                                Column5 = Column5 + (MATRIX[i][o]);
                                if (Column5.equals("XXXXX")) {
                                    win5 = 2;
                                }
                                if (Column5.equals("OOO00")) {
                                    win5 = 1;
                                }
                            }
                        }
                        if (win5 == 1) {
                            JOptionPane.showMessageDialog(null, "El ganador es el jugador O, FELICITACIONES", "Ganador", JOptionPane.INFORMATION_MESSAGE);
                            System.exit(1);
                        }
                        if (win5 == 2) {
                            JOptionPane.showMessageDialog(null, "El ganador es el jugador X, FELICITACIONES", "Ganador", JOptionPane.INFORMATION_MESSAGE);
                            System.exit(1);
                        }
                    }
                } else {
                    JUGADOR = "O";
                    while (couter < 25) {
                        String columna = JOptionPane.showInputDialog(null, "en que columna quieres jugar");
                        String fila = JOptionPane.showInputDialog(null, "en que fila quieres jugar");
                        MATRIX[(Integer.parseInt(fila) - 1)][(Integer.parseInt(columna) - 1)] = "O";
                        JOptionPane.showMessageDialog(null, MATRIX[0][0] + MATRIX[0][1] + MATRIX[0][2] + MATRIX[0][3] + MATRIX[0][4] + "\n" +
                                MATRIX[1][0] + MATRIX[1][1] + MATRIX[1][2] + MATRIX[1][3] + MATRIX[1][4] + "\n" +
                                MATRIX[2][0] + MATRIX[2][1] + MATRIX[2][2] + MATRIX[2][3] + MATRIX[2][4] + "\n" +
                                MATRIX[3][0] + MATRIX[3][1] + MATRIX[3][2] + MATRIX[3][3] + MATRIX[3][4] + "\n" +
                                MATRIX[4][0] + MATRIX[4][1] + MATRIX[4][2] + MATRIX[4][3] + MATRIX[4][4]);
                        int win = 0;
                        String Column;
                        String Row;

                        for (int i = 0; i < 5; i++) {
                            Row = "";
                            Column = "";
                            for (int o = 0; o < 5; o++) {
                                Row = Row + (MATRIX[o][i]);
                                if (Row.equals("XXXXX")) {
                                    win = 2;
                                }
                                if (Row.equals("OOOOO")) {
                                    win = 1;
                                }
                                Column = Column + (MATRIX[i][o]);
                                if (Column.equals("XXXXX")) {
                                    win = 2;
                                }
                                if (Column.equals("OOOOO")) {
                                    win = 1;
                                }
                            }
                        }
                        if (win == 1) {
                            JOptionPane.showMessageDialog(null, "El ganador es el jugador O, FELICITACIONES", "Ganador", JOptionPane.INFORMATION_MESSAGE);
                            System.exit(1);
                        }
                        if (win == 2) {
                            JOptionPane.showMessageDialog(null, "El ganador es el jugador X, FELICITACIONES", "Ganador", JOptionPane.INFORMATION_MESSAGE);
                            System.exit(1);
                        }

                        String Columna2 = JOptionPane.showInputDialog(null, "en que columna quieres jugar");
                        String Fila2 = JOptionPane.showInputDialog(null, "en que fila quieres jugar");
                        MATRIX[(Integer.parseInt(Fila2) - 1)][(Integer.parseInt(Columna2) - 1)] = "X";
                        JOptionPane.showMessageDialog(null, MATRIX[0][0] + MATRIX[0][1] + MATRIX[0][2] + MATRIX[0][3] + MATRIX[0][4] + "\n" +
                                MATRIX[1][0] + MATRIX[1][1] + MATRIX[1][2] + MATRIX[1][3] + MATRIX[1][4] + "\n" +
                                MATRIX[2][0] + MATRIX[2][1] + MATRIX[2][2] + MATRIX[2][3] + MATRIX[2][4] + "\n" +
                                MATRIX[3][0] + MATRIX[3][1] + MATRIX[3][2] + MATRIX[3][3] + MATRIX[3][4] + "\n" +
                                MATRIX[4][0] + MATRIX[4][1] + MATRIX[4][2] + MATRIX[4][3] + MATRIX[4][4]);
                        int win4 = 0;
                        String Column4;
                        String Row4;

                        for (int i = 0; i < 5; i++) {
                            Row4 = "";
                            Column4 = "";
                            for (int o = 0; o < 5; o++) {
                                Row4 = Row4 + (MATRIX[o][i]);
                                if (Row4.equals("XXXXX")) {
                                    win4 = 2;
                                }
                                if (Row4.equals("OOOOO")) {
                                    win4 = 1;
                                }
                                Column4 = Column4 + (MATRIX[i][o]);
                                if (Column4.equals("XXXXX")) {
                                    win4 = 2;
                                }
                                if (Column4.equals("OOOOO")) {
                                    win4 = 1;
                                }
                            }
                        }
                        if (win4 == 1) {
                            JOptionPane.showMessageDialog(null, "El ganador es el jugador O, FELICITACIONES", "Ganador", JOptionPane.INFORMATION_MESSAGE);
                            System.exit(1);
                        }
                        if (win4 == 2) {
                            JOptionPane.showMessageDialog(null, "El ganador es el jugador X, FELICITACIONES", "Ganador", JOptionPane.INFORMATION_MESSAGE);
                            System.exit(1);
                        }
                    }
                }
            }else{
                MATRIX = new String[3][3];
                for (int i = 0; i < 3; i++) {
                    for (int o = 0; o < 3; o++) {
                        MATRIX[i][o] = " - ";
                    }
                }
                JOptionPane.showMessageDialog(null, MATRIX[0][0] + MATRIX[0][1] + MATRIX[0][2]+"\n"+
                        MATRIX[1][0] + MATRIX[1][1] + MATRIX[1][2] + "\n" +
                        MATRIX[2][0] + MATRIX[2][1] + MATRIX[2][2]);
                if (JOptionPane.showOptionDialog(null, "Con cual quieres empesar", "ELIGE TU JUGADOR", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{"X", "O"}, "O") == JOptionPane.YES_OPTION) {
                    JUGADOR = "X";
                    while (couter < 9) {

                        String columna = JOptionPane.showInputDialog(null, "en que columna quieres jugar");
                        String fila = JOptionPane.showInputDialog(null, "en que fila quieres jugar");
                        MATRIX[(Integer.parseInt(fila) - 1)][(Integer.parseInt(columna) - 1)] = "X";
                        JOptionPane.showMessageDialog(null, MATRIX[0][0] + MATRIX[0][1] + MATRIX[0][2]+"\n"+
                                MATRIX[1][0] + MATRIX[1][1] + MATRIX[1][2] + "\n" +
                                MATRIX[2][0] + MATRIX[2][1] + MATRIX[2][2]);
                        int win = 0;
                        String Column;
                        String Row;

                        for (int i = 0; i < 3; i++) {
                            Row = "";
                            Column = "";
                            for (int o = 0; o < 3; o++) {
                                Row = Row + (MATRIX[o][i]);
                                if (Row.equals("XXX")) {
                                    win = 2;
                                }
                                if (Row.equals("OOO")) {
                                    win = 1;
                                }
                                Column = Column + (MATRIX[i][o]);
                                if (Column.equals("XXX")) {
                                    win = 2;
                                }
                                if (Column.equals("OOO")) {
                                    win = 1;
                                }
                            }
                        }
                        if (win== 1) {
                            JOptionPane.showMessageDialog(null, "El ganador es el jugador O, FELICITACIONES","Ganador", JOptionPane.INFORMATION_MESSAGE);
                            System.exit(1);
                        }
                        if (win == 2) {
                            JOptionPane.showMessageDialog(null, "El ganador es el jugador X, FELICITACIONES","Ganador", JOptionPane.INFORMATION_MESSAGE);
                            System.exit(1);
                        }
                        String Columna2 = JOptionPane.showInputDialog(null, "en que columna quieres jugar");
                        String Fila2 = JOptionPane.showInputDialog(null, "en que fila quieres jugar");
                        MATRIX[(Integer.parseInt(Fila2) - 1)][(Integer.parseInt(Columna2) - 1)] = "O";
                        JOptionPane.showMessageDialog(null, MATRIX[0][0] + MATRIX[0][1] + MATRIX[0][2]+"\n"+
                                MATRIX[1][0] + MATRIX[1][1] + MATRIX[1][2] + "\n" +
                                MATRIX[2][0] + MATRIX[2][1] + MATRIX[2][2]);
                        int win3 = 0;
                        String Column3;
                        String Row3;

                        for (int i = 0; i < 3; i++) {
                            Row3 = "";
                            Column3 = "";
                            for (int o = 0; o < 3; o++) {
                                Row3 = Row3 + (MATRIX[o][i]);
                                if (Row3.equals("XXX")) {
                                    win3 = 2;
                                }
                                if (Row3.equals("OOO")) {
                                    win3 = 1;
                                }
                                Column3 = Column3 + (MATRIX[i][o]);
                                if (Column3.equals("XXX")) {
                                    win3 = 2;
                                }
                                if (Column3.equals("OOO")) {
                                    win3 = 1;
                                }
                            }
                        }
                        if (win3== 1) {
                            JOptionPane.showMessageDialog(null, "El ganador es el jugador O, FELICITACIONES","Ganador", JOptionPane.INFORMATION_MESSAGE);
                            System.exit(1);
                        }
                        if (win3 == 2) {
                            JOptionPane.showMessageDialog(null, "El ganador es el jugador X, FELICITACIONES","Ganador", JOptionPane.INFORMATION_MESSAGE);
                            System.exit(1);
                        }
                    }
                } else {
                    JUGADOR = "O";

                    while (couter < 9) {

                        String columna = JOptionPane.showInputDialog(null, "en que columna quieres jugar");
                        String fila = JOptionPane.showInputDialog(null, "en que fila quieres jugar");
                        MATRIX[(Integer.parseInt(fila) - 1)][(Integer.parseInt(columna) - 1)] = "O";
                        JOptionPane.showMessageDialog(null, MATRIX[0][0] + MATRIX[0][1] + MATRIX[0][2]+"\n"+
                                MATRIX[1][0] + MATRIX[1][1] + MATRIX[1][2] + "\n" +
                                MATRIX[2][0] + MATRIX[2][1] + MATRIX[2][2]);
                        int win = 0;
                        String Column;
                        String Row;

                        for (int i = 0; i < 3; i++) {
                            Row = "";
                            Column = "";
                            for (int o = 0; o < 3; o++) {
                                Row = Row + (MATRIX[o][i]);
                                if (Row.equals("XXX")) {
                                    win = 2;
                                }
                                if (Row.equals("OOO")) {
                                    win = 1;
                                }
                                Column = Column + (MATRIX[i][o]);
                                if (Column.equals("XXX")) {
                                    win = 2;
                                }
                                if (Column.equals("OOO")) {
                                    win = 1;
                                }
                            }
                        }
                        if (win== 1) {
                            JOptionPane.showMessageDialog(null, "El ganador es el jugador O, FELICITACIONES","Ganador", JOptionPane.INFORMATION_MESSAGE);
                            System.exit(1);
                        }
                        if (win == 2) {
                            JOptionPane.showMessageDialog(null, "El ganador es el jugador X, FELICITACIONES","Ganador", JOptionPane.INFORMATION_MESSAGE);
                            System.exit(1);
                        }


                        String Columna2 = JOptionPane.showInputDialog(null, "en que columna quieres jugar");
                        String Fila2 = JOptionPane.showInputDialog(null, "en que fila quieres jugar");
                        MATRIX[(Integer.parseInt(Fila2) - 1)][(Integer.parseInt(Columna2) - 1)] = "X";
                        JOptionPane.showMessageDialog(null, MATRIX[0][0] + MATRIX[0][1] + MATRIX[0][2]+"\n"+
                                MATRIX[1][0] + MATRIX[1][1] + MATRIX[1][2] + "\n" +
                                MATRIX[2][0] + MATRIX[2][1] + MATRIX[2][2]);
                        int win2 = 0;
                        String Column2;
                        String Row2;

                        for (int i = 0; i < 3; i++) {
                            Row2 = "";
                            Column2 = "";
                            for (int o = 0; o < 3; o++) {
                                Row2 = Row2 + (MATRIX[o][i]);
                                if (Row2.equals("XXX")) {
                                    win2 = 2;
                                }
                                if (Row2.equals("OOO")) {
                                    win2 = 1;
                                }
                                Column2 = Column2 + (MATRIX[i][o]);
                                if (Column2.equals("XXX")) {
                                    win2 = 2;
                                }
                                if (Column2.equals("OOO")) {
                                    win2 = 1;
                                }
                            }
                        }
                        if (win2== 1) {
                            JOptionPane.showMessageDialog(null, "El ganador es el jugador O, FELICITACIONES","Ganador", JOptionPane.INFORMATION_MESSAGE);
                            System.exit(1);
                        }
                        if (win2 == 2) {
                            JOptionPane.showMessageDialog(null, "El ganador es el jugador X, FELICITACIONES","Ganador", JOptionPane.INFORMATION_MESSAGE);
                            System.exit(1);
                        }
                    }
                }
            }
        }
}


