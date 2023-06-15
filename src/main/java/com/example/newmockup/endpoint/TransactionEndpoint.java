package com.example.newmockup.endpoint;

import com.example.newmockup.model.command.EWalletCriteria;
import com.example.newmockup.model.view.EWalletView;
import com.example.newmockup.model.view.ItemSearchView;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/transactions")
public class TransactionEndpoint {
    @Operation(description = "Search transactions by criteria")
    @GetMapping("")
    public ResponseEntity<ItemSearchView<EWalletView>> filter(EWalletCriteria command) {
        return ResponseEntity.ok(new ItemSearchView());
    }
}
