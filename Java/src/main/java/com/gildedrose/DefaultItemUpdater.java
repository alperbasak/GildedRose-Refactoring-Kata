package com.gildedrose;

public class DefaultItemUpdater implements Degrader {

    public final Item item;

    public DefaultItemUpdater(Item item) {
        this.item = item;
    }

    @Override
    public void degrade() {
        item.sellIn--;
        item.quality--;
        if (item.sellIn < 0) {
            item.quality--;
        }
        validateQuality();
    }


    public void validateQuality() {
        if (item.quality < 0) item.quality = 0;
        if (item.quality > 50) item.quality = 50;
    }
}
