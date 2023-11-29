/*
    Aufgabe 1) Codeanalyse, Codingstyle und Methoden
*/
public class Aufgabe1 {
    //TODO zu Punkt a): Beschreiben Sie hier in wenigen Sätzen was der Spaghetticode macht
    //Es zeichnet einen shape innerhalb einer Box wobei es überall wo ein Zeichen anders vorkommt
    //Eine Schleife macht für die Zeichenfolge, dann eine neue Schleife für das nächste Zeichen, usw.
    //und das für jede einzelne Zeile.

    //TODO zu Punkt b): Beschreiben Sie in wenigen Sätzen was Sie ändern würden und warum
    //Am Anfang wird der Deckel des Vierecks gezeichnet und am Ende genau dasselbe.
    //Für alles dazwischen, Am Anfang und Ende jeder Zeile gehört ein * und dann jeweils
    //2n (anfangend mit 0) '+' wobei es links ein '/' und rechts ein '\' hat.
    //Das geht so hoch solange 2n <= Zeile - 4 Zeichen gilt (die -4 Zeichen wegen *,/ und \)
    //alles andere wird mit einem Leerzeichen gefühlt.
    //Anfang und Ende sind Randfälle, danach kann man alles in einer 2d Schleife machen und damit
    //Schleifen sparen.


    //TODO zu Punkt c): Implementieren Sie hier die Methoden Ihrer Lösung
    /*public static String formShape(int width, int height, char character) {
        String shape = "";
        int whitespace = 0;
        int fill = 0;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (i <= height/2) {
                    fill = 2*i;
                    whitespace = width - fill;
                    for (int k = 1; k <= width; k++) {
                        if (k<=whitespace/2) {
                            System.out.print(" ");
                        }
                        if(k<=width-whitespace/2) {

                        }
                    }
                }
            }
            
        }
        return shape;
    }

    public static String formBorder() {
        return null;
    }
*/

    public static void main(String args[]) {
        //********************************************************
        //TODO zu Punkt d): Implementieren Sie hier Ihre Lösung für die Angabe
        System.out.println("Ihre Ausgabe:");

        //********************************************************

        System.out.println();
        System.out.println("Ausgabe Spaghetticode:");
        System.out.print("#");
        for (int i = 1; i <= 8; i++) {
            System.out.print("+");
        }
        System.out.println("#");
        for (int i = 1; i < 5; i++) {
            System.out.print("*");
            for (int j = 2; j <= (8 / 2 - i + 1); j++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int j = 1; j <= 2 * (i - 1); j++) {
                System.out.print("+");
            }
            System.out.print("\\");
            for (int j = 2; j <= (8 / 2 - i + 1); j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int i = 1; i < 5; i++) {
            System.out.print("*");
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int j = 1; j <= (8 - 2 * i); j++) {
                System.out.print("+");
            }
            System.out.print("/");
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int i = 1; i < 5; i++) {
            System.out.print("*");
            for (int j = 2; j <= (8 / 2 - i + 1); j++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int j = 1; j <= 2 * (i - 1); j++) {
                System.out.print("+");
            }
            System.out.print("\\");
            for (int j = 2; j <= (8 / 2 - i + 1); j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int i = 1; i < 5; i++) {
            System.out.print("*");
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int j = 1; j <= (8 - 2 * i); j++) {
                System.out.print("+");
            }
            System.out.print("/");
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        System.out.print("#");
        for (int i = 1; i <= 8; i++) {
            System.out.print("+");
        }
        System.out.println("#");
    }
}


