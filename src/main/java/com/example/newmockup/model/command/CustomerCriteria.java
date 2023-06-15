package com.example.newmockup.model.command;

import com.example.newmockup.model.criteria.DefaultCriteria;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import javax.validation.constraints.*;
import java.time.Instant;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CustomerCriteria extends DefaultCriteria {
    @Schema(description = "Thời gian bắt đầu, nếu để trống thì tìm kiếm tự động trong vòng 6 tháng đổ lại từ thời gian kết thúc")
    private Instant from;

    @Schema(description = "Thời gian kết thúc, phải sau thời gian bắt đầu, trước ngày hiện tại")
    @NotNull
    private Instant to;

    @Schema(description = "Ngân hàng, người dùng được chọn 1 hay nhiều bank")
    @Pattern(regexp = "[A-Za-z0-9@]")
    private List<String> banks;
}
