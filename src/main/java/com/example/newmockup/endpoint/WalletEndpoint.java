package com.example.newmockup.endpoint;

import com.example.newmockup.model.command.CustomerCriteria;
import com.example.newmockup.model.command.EWalletCriteria;
import com.example.newmockup.model.command.TransactionCriteria;
import com.example.newmockup.model.view.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.ByteArrayInputStream;


@RestController
@RequestMapping("/api/e-wallets")
public class WalletEndpoint {
    @Operation(description = "Báo cáo tổng quan")
    @GetMapping("/summary")
    public ResponseEntity<SummaryView> summary(TransactionCriteria criteria) {
        return ResponseEntity.ok(new SummaryView());
    }

    @Operation(description = "Báo cáo danh sách ví")
    @GetMapping("")
    public ResponseEntity<UserSearchView> filter(EWalletCriteria criteria) {
        return ResponseEntity.ok(new UserSearchView());
    }

    @Operation(description = "Download danh sách ví")
    @PostMapping("/download/file")
    public ResponseEntity<InputStreamResource> downloadReport(@RequestBody EWalletCriteria criteria){
        byte[] bytes = new byte[100000000];
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        InputStreamResource inputStreamResource = new InputStreamResource(byteArrayInputStream);
        HttpHeaders headers = new HttpHeaders();
        String fileName = "result.xlsx";
        headers.add("Content-Disposition", "attachment; filename=" + fileName);
        headers.add("Content-Encoding", "UTF-8");
        headers.setContentType(MediaType.parseMediaType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"));
        return ResponseEntity.ok().headers(headers).body(inputStreamResource);
    }

    @Operation(description = "Báo cáo chi tiết khách hàng")
    @Parameter(name = "id", description = "Id của ví")
    @GetMapping("/{id}")
    public ResponseEntity<ItemSearchView<UserDetailView>> findById(@PathVariable("id") String id , CustomerCriteria criteria) {
        return ResponseEntity.ok(new ItemSearchView<UserDetailView>());
    }

    @Operation(description = "Báo cáo giao dịch")
    @GetMapping("/transactions")
    public ResponseEntity<ItemSearchView<TransactionReportView>> filterTransaction(TransactionCriteria command) {
        return ResponseEntity.ok(new ItemSearchView<TransactionReportView>());
    }
    @Operation(description = "Download báo cáo giao dịch")
    @PostMapping("/transactions/download/file")
    public ResponseEntity<InputStreamResource> downloadReportTransaction(@RequestBody TransactionCriteria criteria){
        byte[] bytes = new byte[100000000];
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        InputStreamResource inputStreamResource = new InputStreamResource(byteArrayInputStream);
        HttpHeaders headers = new HttpHeaders();
        String fileName = "result.xlsx";
        headers.add("Content-Disposition", "attachment; filename=" + fileName);
        headers.add("Content-Encoding", "UTF-8");
        headers.setContentType(MediaType.parseMediaType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"));
        return ResponseEntity.ok().headers(headers).body(inputStreamResource);
    }

    @Operation(description = "Báo cáo khách hàng cá nhân")
    @GetMapping("/customers")
    public ResponseEntity<ItemSearchView<CustomerReportView>> filterCustomer(CustomerCriteria criteria) {
        return ResponseEntity.ok(new ItemSearchView<CustomerReportView>());
    }
    @Operation(description = "Download báo cáo khách hàng cá nhân")
    @PostMapping("/customers/download/file")
    public ResponseEntity<InputStreamResource> downloadReportCustomer(@RequestBody CustomerCriteria criteria){
        byte[] bytes = new byte[100000000];
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        InputStreamResource inputStreamResource = new InputStreamResource(byteArrayInputStream);
        HttpHeaders headers = new HttpHeaders();
        String fileName = "result.xlsx";
        headers.add("Content-Disposition", "attachment; filename=" + fileName);
        headers.add("Content-Encoding", "UTF-8");
        headers.setContentType(MediaType.parseMediaType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"));
        return ResponseEntity.ok().headers(headers).body(inputStreamResource);
    }
}
