package ru.netology;

import static org.testng.Assert.assertEquals;
class CashBackHackerTest {
    @org.testng.annotations.Test
    public void testRemain(){
        CashBackHacker service = new CashBackHacker();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void testRemainLessThenMinAmount(){
        CashBackHacker service = new CashBackHacker();
        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;
        assertEquals(actual, expected);
    }
  
}
