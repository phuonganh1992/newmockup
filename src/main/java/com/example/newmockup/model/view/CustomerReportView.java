package com.example.newmockup.model.view;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.math.BigInteger;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerReportView {
    @Schema(description = "Số ví")
    @Pattern(regexp = "^WID-.{21}$")
    private String id;

    @Schema(description = "CMND, CCCD, hộ chiếu khách hàng")
    @Pattern(regexp = "[A-Za-z0-9]")
    @Size(max = 20)
    private String identityCard;

    @Schema(description = "Họ và tên")
    @Size(min = 30)
    private String fullName;

    @Schema(description = "Số dư đầu kỳ")
    private BigInteger openingBalance;

    @Schema(description = "Số dư cuối kỳ")
    private BigInteger closingBalance;

    @Schema(description = "Tổng số lượng giao dịch, tổng giá trị giao dịch theo từng loại giao dịch")
    private List<TransactionByType> transactionByTypes;
}
