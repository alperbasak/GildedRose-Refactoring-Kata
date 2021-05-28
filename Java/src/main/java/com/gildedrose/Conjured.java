package com.gildedrose;

public class Conjured extends MarketItem {

    public Conjured(Item item) {
        super(item);
    }


    // TODO Does not match stdout.gr!
    // - "Conjured" items degrade in Quality twice as fast as normal items
//    @Override
//    public void degrade() {
//        sellIn--;
//        quality -= 2;
//        if (sellIn <= 0) {
//            quality -= 2;
//        }
//        validateQuality();
//    }
}
