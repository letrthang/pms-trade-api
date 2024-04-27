package org.pms.trade.service;

import org.pms.trade.dto.PortfolioDto;

import java.util.List;

public interface PortfolioService {
    List<PortfolioDto> getAllPortfolios();
    int getPortfolioValue(String portfolioNumber);

    double getCurrentPerformance(String portfolioNumber);

}
