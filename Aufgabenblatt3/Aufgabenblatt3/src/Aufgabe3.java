/*
    Aufgabe 3) Rekursion
*/
public class Aufgabe3 {

    private static void printOddNumbersAscending(int start, int end) {
        //TODO: Implementieren Sie hier Ihre Lösung für die Methode
        if (start==end) {
            System.out.println(start);
            return;
        }
        if (start%2==0){
            printOddNumbersAscending(start+1, end);
        } else {
            System.out.print(start + " ");
            printOddNumbersAscending(start+1, end);
        }

    }

    private static void printEvenNumbersDescending(int end) {
        //TODO: Implementieren Sie hier Ihre Lösung für die Methode
        if (end<=1) {
            System.out.println(0);
            return;
        }
        if (end%2==1)
            printEvenNumbersDescending(end-1);
        else {
            System.out.print(end + " ");
            printEvenNumbersDescending(end-1);
        }
    }

    private static int countDigitsAboveFive(int number) {
        //TODO: Implementieren Sie hier Ihre Lösung für die Methode
        int result = 0;
        if (number < 10) {
            if (number > 5) ++result;
            return result;
        }
        if((number%10) > 5) ++result;
        return result+countDigitsAboveFive(number/10);
    }

    private static boolean checkIfStopAvailable(String text) {
        // TODO: Implementieren Sie hier Ihre Lösung für die Methode
        String textSmall = text.toLowerCase();
        if (text.length()<4) return false;
        if (textSmall.charAt(0)=='s' &&
                textSmall.charAt(1)=='t' &&
                textSmall.charAt(2)=='o' &&
                textSmall.charAt(3)=='p') {
            return true;
        } else {
            return checkIfStopAvailable(text.substring(1));
        }
    }



    public static void main(String[] args) {
        printOddNumbersAscending(3, 15);
        System.out.println();
        printEvenNumbersDescending(14);
        System.out.println();

        System.out.println(countDigitsAboveFive(6));
        System.out.println(countDigitsAboveFive(4));
        System.out.println(countDigitsAboveFive(456));
        System.out.println(countDigitsAboveFive(1234));
        System.out.println(countDigitsAboveFive(61238));
        System.out.println(countDigitsAboveFive(93862));
        System.out.println(countDigitsAboveFive(518279463));
        System.out.println();

        System.out.println(checkIfStopAvailable(""));
        System.out.println(checkIfStopAvailable("sto"));
        System.out.println(checkIfStopAvailable("STOP"));
        System.out.println(checkIfStopAvailable("stOkP3tOp"));
        System.out.println(checkIfStopAvailable("dasStOpistda"));
        System.out.println(checkIfStopAvailable("ASTOP"));
        System.out.println(checkIfStopAvailable("asTsTopstoPb"));

        //DIE NACHFOLGENDEN ZEILEN SIND ZUM TESTEN DER METHODE.
        //**********************************************************************
        assert (countDigitsAboveFive(6) == 1);
        assert (countDigitsAboveFive(4) == 0);
        assert (countDigitsAboveFive(456) == 1);
        assert (countDigitsAboveFive(1234) == 0);
        assert (countDigitsAboveFive(61238) == 2);
        assert (countDigitsAboveFive(93862) == 3);
        assert (countDigitsAboveFive(518279463) == 4);

        assert(!checkIfStopAvailable(""));
        assert(!checkIfStopAvailable("sto"));
        assert(checkIfStopAvailable("STOP"));
        assert(!checkIfStopAvailable("stOkP3tOp"));
        assert(checkIfStopAvailable("dasStOpistda"));
        assert(checkIfStopAvailable("ASTOP"));
        assert(checkIfStopAvailable("asTsTopstoPb"));
        //**********************************************************************
    }
}

