package com.gildedrose;

public class AgedBrie extends MarketItem {

    public AgedBrie(Item item) {
        super(item);
    }

    @Override
    public void degrade() {
        this.sellIn--;
        this.quality++;
        if (sellIn < 0) {
            quality++;
        }
        validateQuality();
    }
}
