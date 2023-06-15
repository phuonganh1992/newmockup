package com.example.newmockup.model.command;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TransactionCriteria {
    @Schema(description = "Thời gian bắt đầu, nếu để trống thì tìm kiếm tự động trong vòng 6 tháng đổ lại từ thời gian kết thúc")
    private Instant from;

    @Schema(description = "Thời gian kết thúc, phải sau thời gian bắt đầu, trước ngày hiện tại")
    @NotNull
    private Instant to;
}
