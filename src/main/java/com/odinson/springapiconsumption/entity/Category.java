package com.odinson.springapiconsumption.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Category {

    private Item Item;

    public Category() {
    }

    public Item getItem() {
        return Item;
    }

    public void setItem(Item item) {
        this.Item = item;
    }

    @Override
    public String toString() {
        return "Category{" +
                "item=" + Item +
                '}';
    }
}
