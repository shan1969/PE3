package com.pe3.Ex5;

import java.util.Scanner;

public class ChessBoardLayout {

    public void printChessBoard(int size)
    {
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                if((i+j)%2 == 0)
                    System.out.print("WW |");
                else
                    System.out.print("BB |");
            }
            System.out.println();
        }

    }

    public boolean chBoardSize(int size)
    {
        boolean flag = false;
        if (size == 8)
           flag = true;
        else
            flag=false;
        return flag;
    }

    public static void main(String args[])
    {

        //Creating object for ChessBoardLayout

        ChessBoardLayout cb = new ChessBoardLayout();

        //Accepting the Chess Board rows and Columns
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        //Verifying the ChessBoardSize method
        boolean res=cb.chBoardSize(size);


        //Calling the print_Chess_Board method
        if(res) {
            cb.printChessBoard(size);
        }
        else
        {
            System.out.println("Invalid Size");
        }
    }
}
