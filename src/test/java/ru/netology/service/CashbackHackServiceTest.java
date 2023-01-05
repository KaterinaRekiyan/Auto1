package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void test1Remain() {
        CashbackHackService hackService = new CashbackHackService();
        int amount = 900;
        int actual = hackService.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void test2Remain() {
        CashbackHackService hackService = new CashbackHackService();
        int amount = 1900;
        int actual = hackService.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void test3Remain() {
        CashbackHackService hackService = new CashbackHackService();
        int amount = 1000;
        int actual = hackService.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

}