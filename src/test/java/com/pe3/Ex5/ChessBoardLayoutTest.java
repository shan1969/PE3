package com.pe3.Ex5;

import static org.junit.Assert.*;

public class ChessBoardLayoutTest {

    ChessBoardLayout cb = new ChessBoardLayout();

    @org.junit.Test
    public void chBoardSizeTest() {
        int s=8;
        assertEquals(true,cb.chBoardSize(s));
    }

    @org.junit.Test
    public void chBoardSizeTest1() {
        int s1=9;
        assertEquals(false, cb.chBoardSize(s1));
    }
}