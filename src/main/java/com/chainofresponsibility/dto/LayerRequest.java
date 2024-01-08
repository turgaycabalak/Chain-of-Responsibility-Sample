package com.chainofresponsibility.dto;

public record LayerRequest(
        int selection1,// it could be enum, 'LayerSelectionOne' if you want.
        int selection2
) {
}
