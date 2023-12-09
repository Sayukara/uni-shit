/*
    Aufgabe 2) Zweidimensionale Arrays - Diverse Methoden
*/

import java.util.Arrays;

public class Aufgabe2 {

    private static char[][] makeOver(char[][] inputArray) {
        char star = '*';
        char[][] cuteMessage = new char[inputArray.length+2][];
        cuteMessage[0] = new char[inputArray[0].length+2];

        //erste Zeile
        for (int i = 0; i < cuteMessage[0].length; i++) {
            cuteMessage[0][i] = star;
        }

        //sandwich
        for (int i = 1; i < cuteMessage.length-1; i++) {
            cuteMessage[i] = new char[inputArray[i-1].length+2];
            cuteMessage[i][0] = star;
            for (int j = 0; j < inputArray[i-1].length; j++) {
                cuteMessage[i][j+1] = inputArray[i-1][j];
            }
            cuteMessage[i][cuteMessage[i].length-1] = star;

        }
        //letzte Zeile
        cuteMessage[cuteMessage.length-1] = new char[inputArray[inputArray.length-1].length+2];
        for (int i = 0; i < cuteMessage[cuteMessage.length-1].length; i++) {
            cuteMessage[cuteMessage.length-1][i] = star;
        }

        return cuteMessage;
    }

    private static void change(int[][] workArray) {
        for (int i = 0; i < workArray.length; i++) {
            int absolute = 0;
            if (workArray[i].length==0) {
                if(i==workArray.length-1) { //wenn die letzte Zeile leer ist dann kannst gleich aufhören
                    break;
                }
                else {
                    i++; //sonst zur nächsten Zeile
                }
            }
            if (workArray[i][0] < 0) {
                absolute = Math.abs(workArray[i][0]); //absoluten Wert nehmen
            }
            if ((absolute >= workArray[i].length))
                workArray[i] = new int[]{}; //wenn weniger Elemente existent ab absolut dann leeren
            else { //sonst ab absolute neu füllen
                int n = 0;
                int[] temp = new int[workArray[i].length];
                int length = workArray[i].length;
                for (int j = 0; j < workArray[i].length; j++) {
                    temp[j] = workArray[i][j];
                }
                workArray[i] = new int[length-absolute];
                for (int j = absolute; j < length; j++) {
                    workArray[i][n++] = temp[j];
                }
            }
        }

    }

    //Vorgegebene Methode - BITTE NICHT VERÄNDERN!
    private static void printArray(char[][] inputArray) {
        if (inputArray != null) {
            for (char[] arr : inputArray) {
                for (char val : arr) {
                    System.out.print(val);
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    //Vorgegebene Methode - BITTE NICHT VERÄNDERN!
    private static void printArray(int[][] inputArray) {
        if (inputArray != null) {
            for (int[] arr : inputArray) {
                for (int val : arr) {
                    System.out.print(val + "\t");
                }
                System.out.println();
            }
        }
    }

    //Vorgegebene Methode - BITTE NICHT VERÄNDERN!
    private static void printArray(int[] inputArray) {
        if (inputArray != null) {
            for (int val : inputArray) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        System.out.println("Test: makeOver");
        System.out.println();

        char[][] array1 = {{'H', 'i', '!'}, {'E', 'P'}, {'1'}};
        char[][] result1 = makeOver(array1);
        printArray(result1);
        assert (Arrays.deepEquals(result1, new char[][]{{'*', '*', '*', '*', '*'},
                                                        {'*', 'H', 'i', '!', '*'},
                                                        {'*', 'E', 'P', '*'},
                                                        {'*', '1', '*'},
                                                        {'*', '*', '*'}}));

        char[][] array2 = {{'O'}};
        char[][] result2 = makeOver(array2);
        printArray(result2);
        assert (Arrays.deepEquals(result2, new char[][]{{'*', '*', '*'},
                                                        {'*', 'O', '*'},
                                                        {'*', '*', '*'}}));

        char[][] array3 = {{'H'}, {'H', 'H', 'H'}, {'H'}};
        char[][] result3 = makeOver(array3);
        printArray(result3);
        assert (Arrays.deepEquals(result3, new char[][]{{'*', '*', '*'},
                                                        {'*', 'H', '*'},
                                                        {'*', 'H', 'H','H', '*'},
                                                        {'*', 'H', '*'},
                                                        {'*', '*', '*'}}));


        System.out.println("Test: change");
        System.out.println();

        int[][] array4 = {{1, 4, -2, 0}, {2}, {-3, -1}, {-2, 6, -5, 8, 3}};
        System.out.println("Before:");
        printArray(array4);
        change(array4);
        System.out.println("After:");
        printArray(array4);
        assert (Arrays.deepEquals(array4, new int[][]{{1, 4, -2, 0}, {2}, {}, {-5, 8, 3}}));


        int[][] array5 = {{0, 2}, {}, {-1, 5}};
        System.out.println("Before:");
        printArray(array5);
        change(array5);
        System.out.println("After:");
        printArray(array5);
        assert (Arrays.deepEquals(array5, new int[][]{{0, 2}, {}, {5}}));


        int[][] array6 = {{-2, -2, 0}, {-1}, {2, -1, -3}, {-3, 4, -2, 6, 8, -5}};
        System.out.println("Before:");
        printArray(array6);
        change(array6);
        System.out.println("After:");
        printArray(array6);
        assert (Arrays.deepEquals(array6, new int[][]{{0}, {}, {2, -1, -3}, {6, 8, -5}}));
    }


}