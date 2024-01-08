package com.chainofresponsibility.util.layerchainofresponsibility;

import com.chainofresponsibility.dto.LayerRequest;
import com.chainofresponsibility.entity.Layer;

public interface LayerCategorizer {
    void categorizeLayer(LayerRequest layerRequest, Layer layer);
}
