package ru.netology;

import org.junit.Test;
import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnHint1ForAmount999() {

            CashbackHackService hack = new CashbackHackService();

            int amount = 999;
            int expected = 1;

            int actual = hack.remain(amount);

            assertEquals(expected, actual);
    }
    @Test
    public void shouldReturnHint0ForAmount1000() {
        //       void shouldCheckCashbackLimit() {

        CashbackHackService hack = new CashbackHackService();

        int amount = 1000;
        int expected = 0;

        int actual = hack.remain(amount);

        assertEquals(expected, actual);
    }
    @Test
    public void shouldReturnHint999ForAmount1001() {

        CashbackHackService hack = new CashbackHackService();

        int amount = 1001;
        int expected = 999;

        int actual = hack.remain(amount);

        assertEquals(expected, actual);
    }
    @Test
    public void shouldReturnHint999ForAmount2001() {

        CashbackHackService hack = new CashbackHackService();
        // I believe something is wrong here

        int amount = 2001;
        int expected = 999;

        int actual = hack.remain(amount);

        assertEquals(expected, actual);
    }
    @Test
    public void shouldReturnHint1000ForAmount0() {

        CashbackHackService hack = new CashbackHackService();

        int amount = 0;
        int expected = 1000;

        int actual = hack.remain(amount);

        assertEquals(expected, actual);
    }
    @Test
    public void shouldThrowAnExceptionForNegative() {

        CashbackHackService hack = new CashbackHackService();

        int amount = -1;

// what exception is used for negative numbers?
// will IAE work for inherited classes?
// are there other classes similar to IAE?

        assertThrows(IllegalArgumentException.class, () -> {
            hack.remain(amount);
        });
    }
}