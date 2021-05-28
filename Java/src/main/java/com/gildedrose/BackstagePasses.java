package com.gildedrose;

public class BackstagePasses extends MarketItem {

    public BackstagePasses(Item item) {
        super(item);
    }

    @Override
    public void degrade() {
        sellIn--;
        quality++;

        // TODO Does not match stdout.gr!
        // Quality increases by 2 when there are 10 days or less
        // if (sellIn <= 10) {
        if (sellIn < 10) {
            quality++;
        }
        // by 3 when there are 5 days or less
        if (sellIn < 5) {
            quality++;
        }
        if (sellIn < 0) {
            quality = 0;
        }
        validateQuality();
    }
}
