package com.chainofresponsibility.service;

import com.chainofresponsibility.dto.LayerRequest;
import com.chainofresponsibility.entity.Layer;
import com.chainofresponsibility.repository.LayerRepository;
import com.chainofresponsibility.util.layerchainofresponsibility.LayerClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LayerService {

    private final LayerRepository layerRepository;
    private final LayerClient layerClient;



    public Layer createLayer(LayerRequest layerRequest) {
        Layer layerWillBeSaved = new Layer();
        layerWillBeSaved.setFieldN("unconditioned field");

        //------   1-) IF-ELSE   --------
//        if (layerRequest.selection1() == 1) {// category1
//            //field1 and field2 will be set. rest null
//            layerWillBeSaved.setField1("field1-set");
//            layerWillBeSaved.setField2("field2-set");
//
//        } else if (layerRequest.selection1() == 2) {// category2
//            //field3 and field4 will be set. rest null
//            layerWillBeSaved.setField3("field3-set");
//            layerWillBeSaved.setField4("field4-set");
//        }

        //--------  2-) CHAIN OF RESPONSIBILITY  ----------
        layerClient.processLayerCategorizer(layerRequest, layerWillBeSaved);

        return layerRepository.save(layerWillBeSaved);
    }
}
