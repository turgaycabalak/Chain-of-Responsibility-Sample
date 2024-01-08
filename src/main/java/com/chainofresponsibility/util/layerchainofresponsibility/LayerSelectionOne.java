package com.chainofresponsibility.util.layerchainofresponsibility;

public enum LayerSelectionOne {
    CATEGORY_ONE(1),
    CATEGORY_TWO(2);

    private final int categoryValue;


    LayerSelectionOne(int categoryValue) {
        this.categoryValue = categoryValue;
    }

    public int getCategoryValue() {
        return categoryValue;
    }
}
