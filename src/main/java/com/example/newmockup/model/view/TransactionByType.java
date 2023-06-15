package com.example.newmockup.model.view;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TransactionByType {
    @Schema(description = "Loại giao dịch: rút tiền, nạp tiền, thanh toán, chuyển tiền ví - ví, chuyển tiền điện tử")
    private String type;

    @Schema(description = "Số lượng giao dịch")
    private BigInteger quantity;

    @Schema(description = "Tổng giá trị giao dịch")
    private BigInteger amount;
}
