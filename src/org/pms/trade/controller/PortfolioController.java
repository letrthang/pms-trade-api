package org.pms.trade.controller;


import lombok.AllArgsConstructor;
import org.pms.trade.dto.PortfolioDto;
import org.pms.trade.service.PortfolioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Represents a portfolio controller in the application.
 * This will provide functionality for managing portfolio information.
 *
 * @author Randika Isuru Vijayanga
 * @version 1.0
 */
@CrossOrigin("*")
@AllArgsConstructor
@RestController
public class PortfolioController {
    private final PortfolioService portfolioService;
    @GetMapping("/portfolios")
    public ResponseEntity<List<PortfolioDto>> getAllPortfolios(){
        List<PortfolioDto> employees = portfolioService.getAllPortfolios();
        return ResponseEntity.ok(employees);
    }
    @GetMapping("/getPortfolioValue")
    public ResponseEntity getPortfolioValue(@RequestParam(name = "portfolioNumber", required = false) String portfolioNumber){
        int portfolioValue = portfolioService.getPortfolioValue(portfolioNumber);
        return ResponseEntity.ok(portfolioValue);
    }

    @GetMapping("/getCurrentPerformance")
    public ResponseEntity getCurrentPerformance	(@RequestParam(name = "portfolioNumber", required = false) String portfolioNumber){
        int portfolioValue = portfolioService.getPortfolioValue(portfolioNumber);
        return ResponseEntity.ok(portfolioValue);
    }

}
