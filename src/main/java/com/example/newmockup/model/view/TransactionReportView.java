package com.example.newmockup.model.view;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.math.BigInteger;
import java.time.Instant;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TransactionReportView {
    @Schema(description = "Ngày giao dịch")
    private Instant transactionDate;
    private BigInteger depositQuantity;
    private BigInteger depositAmount;
    private BigInteger withdrawQuantity;
    private BigInteger withdrawAmount;
    private BigInteger purchaseQuantity;
    private BigInteger purchaseAmount;
    private BigInteger onepayTransferQuantity;
    private BigInteger onepayTransferAmount;
    private BigInteger bankTransferQuantity;
    private BigInteger bankTransferAmount;



}
