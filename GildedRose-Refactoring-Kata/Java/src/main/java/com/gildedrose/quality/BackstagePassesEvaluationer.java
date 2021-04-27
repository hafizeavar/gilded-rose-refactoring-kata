package com.gildedrose.quality;

import com.gildedrose.Item;

public class BackstagePassesEvaluationer extends ItemEvaluationer {

    private final int INC2_DAY_CNT = 11;
    private final int INC3_DAY_CNT = 6;
    private final int ZERO_DAY_CNT = 1;


    public int qualityChange(Item item) {
        if(item.sellIn < INC2_DAY_CNT)
            return 2;
        if(item.sellIn < INC3_DAY_CNT)
            return 3;
        if(item.sellIn < ZERO_DAY_CNT)
            return -1 * item.quality;
        return 1;
    }

}
