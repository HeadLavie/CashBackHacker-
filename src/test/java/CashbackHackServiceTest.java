import org.testng.annotations.Test;
import org.junit.Assert;
import ru.netology.CashbackHackService;

public class CashbackHackServiceTest {
    @Test
    public void ShouldCalculateCashback() {
        CashbackHackService service = new CashbackHackService();

        int expected = 500;
        int actual = service.remain(1500);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void ShouldCalculateCashbackZero() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int actual = service.remain(0);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void ShouldCalculateCashbackOne() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void ShouldCalculateCashbackThousand() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(actual, expected);
    }
}