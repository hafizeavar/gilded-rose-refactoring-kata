package com.gildedrose.quality;

import com.gildedrose.Item;

/*
    Set default behaviours for items
 */

public class ItemEvaluationer implements IItemEvaluationer {

    public void itemEval(Item item){
         int change =  qualityChange( item);
         item.quality += change;

         if(item.quality > 50)
             item.quality = 50;

        item.sellIn = item.sellIn + sellInChange(item);
    }

    public int qualityChange(Item item) {
        if(item.quality > 0)
            return -1;

        else return 0;
    }

    public int sellInChange(Item item) {
        return -1;
    }
}
