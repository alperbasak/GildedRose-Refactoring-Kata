package com.gildedrose;

public class MarketItem extends Item implements Degradable {

    public MarketItem(Item item) {
        super(item.name, item.sellIn, item.quality);

        // TODO Does not match stdout.gr!
        // - The Quality of an item is never negative
        // - The Quality of an item is never more than 50
        // validateQuality();
    }

    @Override
    public void degrade() {
        sellIn--;
        quality--;
        if (sellIn < 0) {
            quality--;
        }
        validateQuality();
    }


    public void validateQuality() {
        if (quality < 0) quality = 0;
        if (quality > 50) quality = 50;
    }
}
