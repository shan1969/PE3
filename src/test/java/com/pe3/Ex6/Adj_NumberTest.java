package com.pe3.Ex6;

import org.junit.Test;

import static org.junit.Assert.*;

public class Adj_NumberTest {

   Adj_Number an1 = new Adj_Number();

    @Test
    public void areConsecutives() {
        int size =3;
        int array[]={4,3,2};
        assertEquals(true,an1.areConsecutives(array,size));
    }

    @Test
    public void areConsecutives1() {
        int size =3;
        int array[]={14,3,21};
        assertEquals(false,an1.areConsecutives(array,size));
    }
}