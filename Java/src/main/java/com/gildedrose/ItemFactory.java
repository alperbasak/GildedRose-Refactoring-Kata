package com.gildedrose;

public class ItemFactory {

    public final static String SULFURAS = "Sulfuras";
    public final static String AGED_BRIE = "Aged Brie";
    public final static String BACKSTAGE_PASSES = "Backstage passes";
    public final static String CONJURED = "Conjured";

    public static MarketItem valueOf(Item item) {
        if (item.name.startsWith(SULFURAS)) {
            return new Sulfuras(item);
        } else if (item.name.startsWith(AGED_BRIE)) {
            return new AgedBrie(item);
        } else if (item.name.startsWith(BACKSTAGE_PASSES)) {
            return new BackstagePasses(item);
        } else if (item.name.startsWith(CONJURED)) {
            return new Conjured(item);
        } else
            return new MarketItem(item);
    }
}
