package com.example.newmockup.model.view;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TransactionReportView {
    @Schema(description = "Ngày giao dịch")
    private Instant transactionDate;

    @Schema(description = "Tổng số lượng giao dịch, tổng giá trị giao dịch theo từng loại giao dịch")
    private TransactionByType transactionByType;
}
