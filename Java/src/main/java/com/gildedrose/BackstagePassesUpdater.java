package com.gildedrose;

public class BackstagePassesUpdater extends DefaultItemUpdater {

    public BackstagePassesUpdater(Item item) {
        super(item);
    }

    @Override
    public void degrade() {
        item.sellIn--;
        item.quality++;

        // TODO Does not match stdout.gr!
        // Quality increases by 2 when there are 10 days or less
        // if (sellIn <= 10) {
        if (item.sellIn < 10) {
            item.quality++;
        }
        // by 3 when there are 5 days or less
        if (item.sellIn < 5) {
            item.quality++;
        }
        if (item.sellIn < 0) {
            item.quality = 0;
        }
        validateQuality();
    }
}
