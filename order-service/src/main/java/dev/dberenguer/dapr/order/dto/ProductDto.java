package dev.dberenguer.dapr.order.dto;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
public class ProductDto {
    String code;
    String name;
    Double price;
}