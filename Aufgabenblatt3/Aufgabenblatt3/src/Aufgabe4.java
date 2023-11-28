/*
    Aufgabe 4) Rekursion
*/
public class Aufgabe4 {

    private static int countNOrderedLetters(String text, int index) {
        // TODO: Implementieren Sie hier Ihre Lösung für die Methode
        return -1; //Zeile kann geändert oder entfernt werden.
    }

    private static String duplicateSelectedChar(String text, char character) {
        // TODO: Implementieren Sie hier Ihre Lösung für die Methode
        return null; //Zeile kann geändert oder entfernt werden.
    }

    public static void main(String[] args) {

        String text = "bCaa12fgHIdE32zYxYz";
        System.out.println(countNOrderedLetters(text, 0));
        System.out.println(countNOrderedLetters(text, 1));
        System.out.println(countNOrderedLetters(text, 6));
        System.out.println(countNOrderedLetters(text, 13));
        System.out.println(countNOrderedLetters(text, 17));
        System.out.println();

        System.out.println(duplicateSelectedChar("", 'o'));
        System.out.println(duplicateSelectedChar("K", 'k'));
        System.out.println(duplicateSelectedChar("abcAijk", 'a'));
        System.out.println(duplicateSelectedChar("abcAijk", 'A'));
        System.out.println(duplicateSelectedChar("AbNcdnNopqnUvWN", 'n'));
        System.out.println(duplicateSelectedChar("AbNcdnNopqnUvWN", 'm'));
        System.out.println(duplicateSelectedChar("nothing", 'Z'));

        //DIE NACHFOLGENDEN ZEILEN SIND ZUM TESTEN DER METHODE.
        //**********************************************************************
        assert (countNOrderedLetters(text, 0) == 8);
        assert (countNOrderedLetters(text, 1) == 7);
        assert (countNOrderedLetters(text, 6) == 6);
        assert (countNOrderedLetters(text, 13) == 2);
        assert (countNOrderedLetters(text, 17) == 1);

        assert (duplicateSelectedChar("", 'o').equals(""));
        assert (duplicateSelectedChar("K", 'k').equals("KK1"));
        assert (duplicateSelectedChar("abcAijk", 'a').equals("aabcAAijk2"));
        assert (duplicateSelectedChar("abcAijk", 'A').equals("aabcAAijk2"));
        assert (duplicateSelectedChar("AbNcdnNopqnUvWN", 'n').equals("AbNNcdnnNNopqnnUvWNN5"));
        assert (duplicateSelectedChar("AbNcdnNopqnUvWN", 'm').equals("AbNcdnNopqnUvWN"));
        assert (duplicateSelectedChar("nothing", 'Z').equals("nothing"));
        //**********************************************************************
    }
}
