package week12d01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GoodsTest {

    @Test
    void testGoodsSort() {
        List<Goods> goods = Arrays.asList(
                new Goods(7, 160),
                new Goods(3, 90),
                new Goods(2, 15)
        );

        Collections.sort(goods);
        assertEquals(3, goods.get(0).getWeight());
    }

}