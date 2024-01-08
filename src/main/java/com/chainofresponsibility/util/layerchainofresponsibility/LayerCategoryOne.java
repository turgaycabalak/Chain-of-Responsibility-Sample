package com.chainofresponsibility.util.layerchainofresponsibility;

import com.chainofresponsibility.dto.LayerRequest;
import com.chainofresponsibility.entity.Layer;

import java.util.Objects;

public class LayerCategoryOne implements LayerCategorizer {
    private LayerCategorizer nextCategorizer;

    public void setNextCategorizer(LayerCategorizer nextCategorizer) {
        this.nextCategorizer = nextCategorizer;
    }

    @Override
    public void categorizeLayer(LayerRequest layerRequest, Layer layer) {
        if (layerRequest.selection1() == 1) {// category1
            //field1 and field2 will be set. rest null
            layer.setField1("field1-set");
            layer.setField2("field2-set");

        } else if (Objects.nonNull(nextCategorizer)) {
            nextCategorizer.categorizeLayer(layerRequest, layer);
        }
    }
}
