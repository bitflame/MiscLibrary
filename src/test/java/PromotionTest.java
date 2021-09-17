import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PromotionTest {

    @Test
    void freshPromotin() {
        String[][] codeList = {{"apple", "apple"}, {"banana", "anything", "banana"}};
        String[] shoppingCart = {"orange", "apple", "apple", "banana", "orange", "banana"};
        Assertions.assertEquals(1, Promotion.freshPromotin(codeList, shoppingCart));
        shoppingCart = new String[]{"apple", "apple", "orange", "orange", "banana", "apple", "banana",
                "banana"};
        Assertions.assertEquals(1, Promotion.freshPromotin(codeList, shoppingCart));
    }
}