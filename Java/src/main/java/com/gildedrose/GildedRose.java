package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        for (int i = 0; i < items.length; i++) {
            items[i] = ItemFactory.valueOf(items[i]);
        }
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (item instanceof Degradable) {
                ((Degradable) item).degrade();
            }
        }
    }

}
