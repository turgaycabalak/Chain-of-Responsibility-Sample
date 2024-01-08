package com.chainofresponsibility.controller;

import com.chainofresponsibility.dto.LayerRequest;
import com.chainofresponsibility.entity.Layer;
import com.chainofresponsibility.service.LayerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/layers")
public class LayerController {

    private final LayerService layerService;

    public LayerController(LayerService layerService) {
        this.layerService = layerService;
    }


    @PostMapping("/createLayer")
    public Layer createLayer(@RequestBody LayerRequest layerRequest) {
        Layer layer = layerService.createLayer(layerRequest);
        return layer;
    }


}
