/*
Author: Zakrewski
Date: 28.10.21
*/

import java.util.Scanner;

/*
Они выехали за околицу, на дорогу, шедшую по полям, желтым от рапса и волнующегося на ветру овса. Навстречу тащились груженые возы. Бард перекинул ногу через луку седла, поставил лютню на колено и натренькивал на струнах тоскливые мелодии, время от времени помахивая рукой хихикающим девчонкам в подобранных юбках, топающим по обочине с граблями на крепких плечах.
*/

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your text in one row: ");
        String text = scanner.nextLine();
        scanner.close();

        if(!text.equals("")) TextAnalyser.analyse(text);
    }
}
