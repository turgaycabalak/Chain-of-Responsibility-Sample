package com.chainofresponsibility.util.layerchainofresponsibility;

import com.chainofresponsibility.dto.LayerRequest;
import com.chainofresponsibility.entity.Layer;
import org.springframework.stereotype.Component;

@Component
public class LayerClient {
    private LayerCategorizer chain;

    public LayerClient() {
        LayerCategoryOne layerCategoryOne = new LayerCategoryOne();
        LayerCategoryTwo layerCategoryTwo = new LayerCategoryTwo();

        layerCategoryOne.setNextCategorizer(layerCategoryTwo);

        chain = layerCategoryOne;
    }

    public void processLayerCategorizer(LayerRequest layerRequest, Layer layer) {
        chain.categorizeLayer(layerRequest,layer);
    }
}
