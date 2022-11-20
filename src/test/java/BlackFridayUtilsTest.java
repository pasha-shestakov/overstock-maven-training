import com.overstock.training.BlackFridayUtils;
import org.junit.Assert;
import org.junit.Test;

public class BlackFridayUtilsTest {

    @Test
    public void TestDaysUntil(){
        Assert.assertEquals(5, BlackFridayUtils.DaysToBlackFriday());
    }
}
