package com.gildedrose;

public class AgedBrieUpdater extends DefaultItemUpdater {

    public AgedBrieUpdater(Item item) {
        super(item);
    }

    @Override
    public void degrade() {
        item.sellIn--;
        item.quality++;
        if (item.sellIn < 0) {
            item.quality++;
        }
        validateQuality();
    }
}
