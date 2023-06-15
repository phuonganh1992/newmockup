package com.example.newmockup.endpoint;

import com.example.newmockup.model.command.EWalletCriteria;
import com.example.newmockup.model.view.EWalletView;
import com.example.newmockup.model.view.ItemSearchView;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.ByteArrayInputStream;


@RestController
@RequestMapping("/api/wallets")
public class WalletEndpoint {
    @Operation(description = "Search wallets by criteria")
    @GetMapping("")
    public ResponseEntity<ItemSearchView<EWalletView>> filter(EWalletCriteria criteria) {
        return ResponseEntity.ok(new ItemSearchView());
    }

    @Operation(description = "Download report by criteria")
    @PostMapping("/download")
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
}
