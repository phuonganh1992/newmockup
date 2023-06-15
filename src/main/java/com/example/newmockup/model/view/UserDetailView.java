package com.example.newmockup.model.view;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.util.Map;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDetailView {
    private UserView wallet;
    @Schema(description = "key: bank; value: transaction related deposit & withdraw")
    private Map<String, TransactionByType> transactionByBank;

}
