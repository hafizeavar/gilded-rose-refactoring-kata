package com.gildedrose.quality;

import com.gildedrose.Item;

public class AgedBrieEvaluationer extends ItemEvaluationer {

    public int qualityChange(Item item) {
        return 1;
    }
    public int sellInChange(Item item) {
        return -1;
    }
}
