package com.example.newmockup.model.criteria;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DefaultCriteria {
    @Schema(description = "Số lượng hiển thị bản ghi tối đa trên 1 trang")
    @NotNull
    private Integer size;

    @Schema(description = "Số trang")
    private Integer page;

    @Schema(description = "Sắp xếp")
    private String sort;
}
