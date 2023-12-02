/*
    Aufgabe 1) Code Analyse - Eindimensionale Arrays
*/
public class Aufgabe1 {

    private static void printArray(int[] workArray) {
        for (int i = 0; i < workArray.length; i++) { //Korrektur, = Zeichen weg
            System.out.print(workArray[i] + " ");
        }
        System.out.println();
    }

    private static void fillArray(int[] filledArray) {
        int number = 8;
        for (int i = 0; i < filledArray.length; i++) {
            filledArray[i] = number;
            number += 8;
        }
    }

    private static void printContentFilteredArray(int[] workArray) {
        int[] copiedArray = workArray;
        for (int i = 0; i < copiedArray.length; i++) {
            if (copiedArray[i] % 6 == 0) {
                copiedArray[i] = -1;
            }
        }
        printArray(copiedArray);
    }

    private static void fillArrayWithNewContent(int[] workArray) {
        int[] helpArray = new int[8];
        int number = 8;
        for (int i = 0; i < helpArray.length; i++) {
            helpArray[i] = number;
            number += 8;
        }
        workArray = helpArray;
        printArray(workArray);
    }

    public static void main(String[] args) {
        int[] filledArray = new int[10];
        fillArray(filledArray);
        printArray(filledArray);

        printContentFilteredArray(filledArray);
        printArray(filledArray);

        filledArray[0] = 999;
        printArray(filledArray);

        fillArrayWithNewContent(filledArray);
        printArray(filledArray);
    }

    //**************************************************************************
    //**** Notizen und Fragebeantwortungen bitte hier unterhalb durchführen! ***
    //**************************************************************************
    //Antwort zu Punkt a:
    //Der Index von einem Array fängt bei 0 an, die Länge jedoch bei 1. Sprich Länge 10 ist
    //eigentlich 0 bis 9, hier gehen wir von 0 bis 10, daher exception.
    //Antwort zu Punkt b:
    //Es hat keinen Rückgabewert, weil die Methode void ist, bzw. keinen Rückgabewert verlangt.
    //Es funktioniert trotzdem, weil die Methode nur den Array füllt und die Werte des Arrays dann drinnen
    //abgespeichert sind. Array bleibt gefüllt bis überschrieben oder gelöscht bzw der Array komplett
    //neu initialisiert wird.
    //Antwort zu Punkt c:
    //Der Punkt ist, dass nicht eine Kopie mit den Werten des originellen Arrays erstellt wird, sondern
    //copiedArray ein Array mit Referenzen zum selben Speicherbereich wie der originelle Array ist. Wenn
    //das, auf was referiert wird, dann verändert sich auch alles, was darauf referenziert wird.
    //Antwort zu Punkt d:
    //Durch die Initialisierung von helpArray ensteht ein neuer Speicherbereich auf welches referenziert wird.
    //Der wird dann ausgegeben. Nach der Ausführung von der Methode, wird der helpArray (der nur in der Methode existiert)
    //Speicherbereich nicht mehr  gebraucht bzw. ich nehme an vom GarbageCollector aufgenommen und das originelle Array
    //filledArray greift auf seinen letzten Speicherbereich zurück der noch vorhanden ist. Daher die letzte Ausgabe.
}
