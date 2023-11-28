/*
    Aufgabe 2) Überladen von Methoden
*/
public class Aufgabe2 {

    private static void addChar(String text, char character) {
        //TODO: Implementieren Sie hier Ihre Lösung für die Angabe
        if (text.isEmpty())
            return;
        if (text.length()==1) {
            System.out.println(text);
            return;
        }
        int n = 2;
        for (int i = 0; i < text.length()-1; i++) {
            System.out.print(text.charAt(i));
            for (int j = 0; j < n; j++) {
                System.out.print(character);
            }
            if (n==2) n--;
            else n++;
        }
        System.out.println(text.charAt(text.length()-1));
    }

    private static void addChar(int number, char character) {
        //TODO: Implementieren Sie hier Ihre Lösung für die Angabe
        String num = Integer.toString(number);
        addChar(num, character);
    }

    private static void addChar(String text, String characters) {
        //TODO: Implementieren Sie hier Ihre Lösung für die Angabe
        for (int i = 0; i < characters.length(); i++) {
            addChar(text, characters.charAt(i));
        }
    }

    private static void addChar(String text) {
        //TODO: Implementieren Sie hier Ihre Lösung für die Angabe
        addChar(text, '=');
    }

    public static void main(String[] args) {
        String text0 = "";
        String text1 = "A";
        String text2 = "CW";
        String text3 = "EP1";
        String text4 = "Index";

        addChar(text0, '&');
        addChar(text1, '+');
        addChar(text2, '*');
        addChar(text3, '-');
        addChar(text4, '#');
        System.out.println();

        addChar(1, '.');
        addChar(42, ':');
        addChar(148, '$');
        addChar(2048, ')');
        addChar(131719, '%');
        System.out.println();

        addChar(text2, "!O(");
        addChar(text4, "T1#+");
        System.out.println();

        addChar(text1);
        addChar(text2);
        addChar(text3);
    }
}
