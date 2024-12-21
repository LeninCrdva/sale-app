package tec.edu.azuay.sale.dto.responses;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class BillItemDto implements Serializable {

    private Long billItemId;

    private Integer quantity;

    private Double price;

    private Double subtotal;

    private ProductDto product;

    private BillDto bill;
}
