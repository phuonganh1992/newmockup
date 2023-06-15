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
@Data
public class EWalletCriteria extends DefaultCriteria {
    @Schema(description = "Thời gian bắt đầu, nếu để trống thì tìm kiếm tự động trong vòng 6 tháng đổ lại từ thời gian kết thúc")
    private Instant from;

    @Schema(description = "Thời gian kết thúc, phải sau thời gian bắt đầu, trước ngày hiện tại")
    @NotNull
    private Instant to;

    @Schema(description = "Từ khóa, cho phép người dùng tìm kiếm theo từ khóa với những cột thông tin: Email, tìm kiếm theo dạng like")
    @Max(50)
    @Pattern(regexp = "[A-Za-z0-9@]")
    private String keyword;

    @Schema(description = "Tên khách hàng, tìm kiếm theo dạng like")
    @Size(max = 50)
    @Pattern(regexp = "^[A-Za-z]+$")
    private String fullName;

    @Schema(description = "Số CCCD, cho phép tìm kiếm theo số CCCD, CMND, hộ chiếu, tìm kiếm theo dạng like")
    @Size(max = 20)
    @Pattern(regexp = "[A-Za-z0-9]")
    private String identityCard;

    @Schema(description = "Số điện thoại, tìm kiếm theo dạng like")
    @Size(max = 20)
    @Pattern(regexp = "[0-9]")
    private String phoneNumber;

    @Schema(description = "Trạng thái ví khách hàng")
    @NotEmpty
    private List<String> statusCode;

//    @Schema(description = "Số lượng hiển thị bản ghi tối đa trên 1 trang")
//    @NotNull
//    private Integer size;
//
//    @Schema(description = "Số trang")
//    private Integer page;
//
//    @Schema(description = "Sắp xếp, mặc định sort by fullName theo thứ tự từ A-Z")
//    private String sort;
}
