package com.chainofresponsibility.util.layerchainofresponsibility;

import com.chainofresponsibility.dto.LayerRequest;
import com.chainofresponsibility.entity.Layer;

public class LayerCategoryTwo implements LayerCategorizer {

    @Override
    public void categorizeLayer(LayerRequest layerRequest, Layer layer) {
        if (layerRequest.selection1() == LayerSelectionOne.CATEGORY_TWO.getCategoryValue()) {// category2
            //field3 and field4 will be set. rest null
            layer.setField3("field3-set");
            layer.setField4("field4-set");
        }
    }
}
