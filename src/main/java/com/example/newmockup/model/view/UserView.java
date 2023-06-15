package com.example.newmockup.model.view;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.Instant;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserView {
    @Schema(description = "Số ví")
    @Pattern(regexp = "^WID-.{21}$")
    private String id;

    @Schema(description = "Họ và tên")
    @Size(min = 30)
    private String fullName;

    @Schema(description = "Số điện thoại")
    @Size(max = 15)
    @Pattern(regexp = "[0-9]")
    private String phoneNumber;

    @Schema(description = "Email khách hàng")
    @Email(regexp = "[A-Za-z0-9._]+@[A-Za-z0-9._]+\\.[a-z]{2,3}")
    @Size(max = 50)
    private String email;

    @Schema(description = "CMND, CCCD, hộ chiếu khách hàng")
    @Pattern(regexp = "[A-Za-z0-9]")
    @Size(max = 20)
    private String identityCard;

    @Schema(description = "Ngày khởi tạo: ngày người dùng tạo ví thành công")
    private Instant createdAt;

    @Schema(description = "Số dư")
    private Long balance;

    @Schema(description = "Trạng thái ví của khách: Đã phát hành / Issued, Đã kích hoạt / Verified , Đang hoạt động / Active")
    private String state;
}
