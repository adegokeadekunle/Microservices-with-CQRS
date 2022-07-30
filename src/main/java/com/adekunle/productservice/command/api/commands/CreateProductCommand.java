package com.adekunle.productservice.command.api.commands;

import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.math.BigDecimal;

@Data
@Builder
public class CreateProductCommand {
    @TargetAggregateIdentifier  //uniqueId for every product from axon framework
    private String productId;
    private String name;
    private BigDecimal price ;
    private Integer quantity;
}
