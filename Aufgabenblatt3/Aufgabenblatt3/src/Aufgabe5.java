/*
    Aufgabe 5) Quadrate => Rekursiv vs. Iterativ
*/

import codedraw.CodeDraw;

import java.awt.*;

public class Aufgabe5 {

    private static void drawPatternRecursively(CodeDraw myDrawObj, int x, int y, int s, boolean c) {
        // TODO: Implementieren Sie hier Ihre Lösung für die Methode
        if (s<4) return;
        drawPatternRecursively(myDrawObj,x-s/2, y-s/2,s/2,!c);
        drawPatternRecursively(myDrawObj,x+s/2, y-s/2,s/2,!c);
        drawPatternRecursively(myDrawObj,x-s/2, y+s/2,s/2,!c);
        drawPatternRecursively(myDrawObj,x+s/2, y+s/2,s/2,!c);

        if(c) myDrawObj.setColor(Color.gray);
        else
            myDrawObj.setColor(Color.cyan);
        myDrawObj.fillSquare(x-s/2, y-s/2, s);
    }

    // Iterative Version => ChatGPT 3.5 generiert (nur Aufrufe für Zeichenmethoden und Farben setzen wurden angepasst)
    public static void drawPatternIteratively(CodeDraw myDrawObj, int width) {
        boolean cyan = false;
        for (int i = 2; i <= width/2; i*=2) {
            for (int j = i/2; j < width; j+=i*2) {
                for (int k = i/2; k < width; k+=i*2) {
                    myDrawObj.fillSquare(j,k,i);
                }
                
            }
            if (cyan)
                myDrawObj.setColor(Color.cyan);
            else myDrawObj.setColor(Color.gray);
            cyan=!cyan;
        }
        /*int s = width;
        boolean c = true;

        while (s >= 4) {
            myDrawObj.setColor(c ? Color.GRAY : Color.CYAN);
            myDrawObj.fillSquare(width / 2, width / 2, s);

            int halfSize = s / 2;

            // Zeichne Quadrate in den vier Diagonalrichtungen
            myDrawObj.setColor(c ? Color.GRAY : Color.CYAN);
            myDrawObj.fillSquare(width / 2 - halfSize, width / 2 - halfSize, halfSize);
            myDrawObj.fillSquare(width / 2 + halfSize, width / 2 - halfSize, halfSize);
            myDrawObj.fillSquare(width / 2 - halfSize, width / 2 + halfSize, halfSize);
            myDrawObj.fillSquare(width / 2 + halfSize, width / 2 + halfSize, halfSize);

            s /= 2;
            c = !c;
        }

         */

    }



    public static void main(String[] args) {

        int pixelWidth = 512;
        int pixelHeight = 512;

        CodeDraw myDrawObjR = new CodeDraw(pixelWidth, pixelHeight);
        myDrawObjR.setTitle("Output Recursive Method");
        myDrawObjR.setCanvasPositionX(100);
        myDrawObjR.setCanvasPositionY(100);
        CodeDraw myDrawObjI = new CodeDraw(pixelWidth, pixelHeight);
        myDrawObjI.setTitle("Output Iterative Method");
        myDrawObjI.setCanvasPositionX(650);
        myDrawObjI.setCanvasPositionY(100);


        drawPatternRecursively(myDrawObjR, pixelWidth / 2, pixelHeight / 2, pixelWidth / 2, true);
        myDrawObjR.show();
        drawPatternIteratively(myDrawObjI, pixelWidth);
        myDrawObjI.show();

    }
}


