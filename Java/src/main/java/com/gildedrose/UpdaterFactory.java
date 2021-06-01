package com.gildedrose;

public class UpdaterFactory {

    public final static String SULFURAS = "Sulfuras";
    public final static String AGED_BRIE = "Aged Brie";
    public final static String BACKSTAGE_PASSES = "Backstage passes";
    public final static String CONJURED = "Conjured";

    public static DefaultItemUpdater of(Item item) {
        if (item.name.startsWith(SULFURAS)) {
            return new SulfurasUpdater(item);
        } else if (item.name.startsWith(AGED_BRIE)) {
            return new AgedBrieUpdater(item);
        } else if (item.name.startsWith(BACKSTAGE_PASSES)) {
            return new BackstagePassesUpdater(item);
        } else if (item.name.startsWith(CONJURED)) {
            return new ConjuredUpdater(item);
        } else
            return new DefaultItemUpdater(item);
    }
}
