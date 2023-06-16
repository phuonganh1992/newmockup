package com.example.newmockup.model.view;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SummaryView {
    @Schema(description = "Tổng số dư")
    private BigInteger totalBalance;

    @Schema(description = "Số lượng ví theo trạng thái ví, key:state (issued, verified, active), value: quantity")
    private Map<String, BigInteger> quantities;
}
