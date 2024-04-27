package org.pms.trade.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.pms.trade.entity.PositionEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "PositionServices")
@RestController
@RequestMapping("/PositionServices")
public interface PositionServices {

    @PostMapping(path = "/savePosition")
    @Operation(summary = "savePosition", description = "")
    public Boolean savePosition(
            @RequestHeader("transactionRef") String transactionRef, @RequestHeader("instrumentId") String instrumentId, @RequestHeader("tradeType") String tradeType, @RequestHeader("unit") Integer unit);

    @GetMapping("/getPosition")
    public PositionEntity getPosition(@RequestParam("transactionRef") String transactionRef);

}