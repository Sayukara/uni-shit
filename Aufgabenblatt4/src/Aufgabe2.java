import java.sql.Array;

/*
    Aufgabe 2) Eindimensionale Arrays
*/
public class Aufgabe2 {

    public static void main(String[] args) {
        // TODO: Implementieren Sie hier Ihre Lösung für die Angabe
        //2.a
        int[] cubedArray  = new int[15];
        int n = 2;
        for (int i = 0; i < 15; i++) {
            cubedArray[i] = (int) Math.pow(n+i,3);
        }
        for (int i = 0; i < cubedArray.length; i++) {
            if (cubedArray[i] % 9 == 0)
                cubedArray[i] = 0;
        }
        printArray(cubedArray);

        System.out.println(); //new line für was kommt
        //2.b
        char[] lettersArray = {'a', '8', 'U', '3', ':', '9', 'd', 'F', '-', 'T'};
        n = lettersArray.length;
        for (char c:lettersArray) {
            if(c >= 48 && c <= 57)
                n++;
        }
        char[] modifiedLettersArr = new char[n];
        if (lettersArray.length>modifiedLettersArr.length) {
            System.out.println("?no");
            return;
        }
        System.arraycopy(lettersArray, 0, modifiedLettersArr, 0, lettersArray.length);
        char z = 'Z';
        for (int i = 0; i < modifiedLettersArr.length; i++) {
            char c = modifiedLettersArr[i];
            if(c >= 48 && c <= 57) {

                for (int j = modifiedLettersArr.length-1; j > i; j--) {
                    modifiedLettersArr[j] = modifiedLettersArr[j-1];
                }
                modifiedLettersArr[i] = z;
                i++;
            }
        }

        printArray(modifiedLettersArr);
        System.out.println(); //new line für was kommt

        //2.c
        int[] evenArray = new int[20];
        for (int i = 0; i < evenArray.length; i++) {
            evenArray[i] = i+1;
        }

        for (int i = evenArray.length-1; i >= 0; i-=2) {
            if (i == evenArray.length-1) System.out.print("for-Schleife: ");
            System.out.print(evenArray[i]);
            if (i>2) System.out.print(":");
        }
        System.out.println();

        System.out.print("while-Schleife: ");
        boolean end = false;
        int index = evenArray.length-1;
        while(!end) {
            if(index>=2) {
                System.out.print(evenArray[index] + ":");
                index -= 2;
            }
            else {
                System.out.print(evenArray[index]);
                end = true;
            }


        }

    }
    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
    public static void printArray(char[] arr) {
        for (char x : arr) {
            System.out.print(x + " ");
        }
    }


}

