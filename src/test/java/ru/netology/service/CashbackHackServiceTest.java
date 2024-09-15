package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void amountForCashbackMin () {
        CashbackHackService service = new CashbackHackService ();

        int amount = 999;
        int surcharge;
        surcharge = service.remain(amount);

        int expected = 1;
        int actual = service.remain(amount);


        assertEquals(actual, expected);
    }

    @Test
    public void amountForCashbackBoundary () {
        CashbackHackService service = new CashbackHackService ();

        int amount = 1000;
        int surcharge;
        surcharge = service.remain(amount);

        int expected = 0;
        int actual = service.remain(amount);


        assertEquals(actual, expected);
    }

    @Test
    public void extraPaymentUntilTheNextCashback () {
        CashbackHackService service = new CashbackHackService ();

        int amount = 1001;
        int surcharge;
        surcharge = service.remain(amount);

        int expected = 999;
        int actual = service.remain(amount);


        assertEquals(actual, expected);
    }
}
