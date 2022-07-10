package week9;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //An array can be of classes also


    public static void main(String[] args) {

        /*
        Book book = new Book("java programming","murach",777,"january 1st,2017","murach");
        System.out.println(book.getInfo());
        EBook ebook = new EBook("java programming","murach",
                777,"january 1st,2017","murach","12",343);
        System.out.println(ebook.getInfo());

        AudioBook audioBook = new AudioBook("java programming","murach",
                777,"january 1st,2017","murach","me","2 minutes","3 minutes");
        System.out.println(audioBook.getInfo());

        //Create an array of books
        //inheritance ebook is a book so you can inherit
        Book[] shelf = new Book[3];
        shelf[0] = book;
        shelf[1] = ebook;
        shelf[2] = audioBook;

         for(Book bookOnShelf:shelf){
             System.out.println(bookOnShelf.getInfo());
         }

*/
       //Arrays are of fixed size.
/*
        // [] = array , = new type[size]
        int midtermscores[] = new int[17];
        //Access values? the first item is at index 0
        midtermscores[0] = 100;
        midtermscores[1] = 97;

        int highestScore = midtermscores[0];
        int lowestScore = midtermscores[0];
        float totalScore = 0;
        //FOR loops best way to loop thru arrays
        //they have indexes - the length of the array (not including)
        for(int index = 0; index< midtermscores.length; index++) {
            midtermscores[index] = (int)(Math.random() * 40) + 60;
        }

        for(int score:midtermscores)
        {   System.out.println(score);
            if(score>highestScore) {
                highestScore = score;
              }
            if(score < lowestScore){
                lowestScore = score;
            }

            totalScore +=score;
        }

        //Loop thru collection of values and calculate values.
        System.out.println("Highest Score: "+ highestScore);
        System.out.println("Lowest Score: " + lowestScore);
        System.out.println("Average Score: "+ totalScore/ midtermscores.length);
        //enhanced for loop read only
        //for each value in midterm scores will be referred to as score
        //in the loop

        //This is readonly mode. Will not change values
        for(int score:midtermscores){
            System.out.println(score);
        }
        //Array's of reference types default to NULL - can be dangerous
        //Arrays of prmitive (int,etc) default to zero
        String[] names = new String[8];
        names[0] = "tobey";
        names[1] = "eric";
        names[2] = "Jasmine";
        names[3] = "Joy";
        names[4] = "Jenivive";
        names[5] = "Jackson";
        names[6] = "Jeremy";
        names[7] = "Joe";

        for(String name:names){
            System.out.println(name.toUpperCase());
        }

         //ArrayList ==> Can't use primitive types? Not sure why
         //You can use INT and DOUBLE versions
        ArrayList<Integer> scores = new ArrayList<>();

        int score = 0;
        Scanner keyboard =  new Scanner(System.in);

        while(score !=-1){
            System.out.println("please enter a score or -1 to stop.");
            score = Integer.parseInt(keyboard.nextLine());
            if(score != -1)
            {
                scores.add(score);
            }
        }

        int highestArrayListScore = scores.get(0);
        int lowestArrayListScore = scores.get(0);
        double totalArrayListScores = 0;

        for(int arrayListScore:scores){
            if(arrayListScore > highestArrayListScore){
                highestArrayListScore = arrayListScore;
            }
            if(arrayListScore < lowestArrayListScore)
            {
                lowestArrayListScore = arrayListScore;
            }
            totalArrayListScores = arrayListScore;
        }
        System.out.println("Highest array list score " + highestArrayListScore);
        System.out.println("Lowest array list score " + lowestArrayListScore);
        //Use size() not .length
        System.out.println("Average array list score " + totalArrayListScores /scores.size());
        //You can add to a specific index a specific index
        //You can remove also tricky -> index 10
        //You can remove object also.
        ArrayList<String> namesArrayList = new ArrayList<>();
        namesArrayList.add("Eric");
        namesArrayList.add("Sonic");
        namesArrayList.remove("Eric");
        namesArrayList.remove(0);

 */
        //An Array needs to have same type
        //You can create a two dimensional array!!
        //An array of arrays
        //Each value is a row (Dimensions) Matrix
        //  (row) (column)
        //  row zero , column zero
        int[][] twoDimensionalArray = new int[3][3];

        twoDimensionalArray[0][0] = 1;
        twoDimensionalArray[0][1] = 2;
        twoDimensionalArray[0][2] = 3;

        twoDimensionalArray[1][0] = 4;
        twoDimensionalArray[1][1] = 5;
        twoDimensionalArray[1][2] = 6;

        twoDimensionalArray[2][0] = 7;
        twoDimensionalArray[2][1] = 8;
        twoDimensionalArray[2][2] = 9;






    }
}