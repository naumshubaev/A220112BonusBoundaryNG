package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnHint1ForAmount999() {

            CashbackHackService hack = new CashbackHackService();

            int amount = 999;
            int expected = 1;

            int actual = hack.remain(amount);

            assertEquals(actual, expected);
    }
    @Test
    public void shouldReturnHint1000ForAmount1000() {

        CashbackHackService hack = new CashbackHackService();

        int amount = 1000;
        int expected = 1000;

        int actual = hack.remain(amount);

        assertEquals(actual, expected);
    }
    @Test
    public void shouldReturnHint999ForAmount1001() {

        CashbackHackService hack = new CashbackHackService();

        int amount = 1001;
        int expected = 999;

        int actual = hack.remain(amount);

        assertEquals(actual, expected);
    }
    @Test
    public void shouldReturnHint1000ForAmount2000() {

        CashbackHackService hack = new CashbackHackService();

        int amount = 2000;
        int expected = 1000;

        int actual = hack.remain(amount);

        assertEquals(actual, expected);
    }
    @Test
    public void shouldReturnHint1000ForAmount0() {

        CashbackHackService hack = new CashbackHackService();

        int amount = 0;
        int expected = 1000;

        int actual = hack.remain(amount);

        assertEquals(actual, expected);
    }
    @Test
    public void shouldThrowAnExceptionForNegative() {

        CashbackHackService hack = new CashbackHackService();

        int amount = -1;

// what exception is suitable for negative values?
        assertThrows(IllegalArgumentException.class, () -> {
            hack.remain(amount);
        });
    }
}
