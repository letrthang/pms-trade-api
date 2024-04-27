package org.pms.trade.service.impl;


import lombok.AllArgsConstructor;
import org.pms.trade.dto.PortfolioDto;
import org.pms.trade.entity.PortfolioEntity;
import org.pms.trade.mapper.PortfolioMapper;
import org.pms.trade.repository.PortfolioRepository;
import org.pms.trade.service.PortfolioService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PortfolioServiceImpl implements PortfolioService {

    private final PortfolioRepository portfolioRepository;
    @Override
    public List<PortfolioDto> getAllPortfolios() {
        List<PortfolioEntity> portfolios = portfolioRepository.findAll();
        return portfolios.stream().map(PortfolioMapper::mapToPortfolioDto).collect(Collectors.toList());
    }

    @Override
    public int getPortfolioValue(String portfolioNumber) {
        Integer portfolioValue = portfolioRepository.getPortfolioValue(portfolioNumber);
        return Objects.requireNonNullElse(portfolioValue, 43213);
    }

    @Override
    public double getCurrentPerformance(String portfolioNumber) {
        Double currentPerformance = portfolioRepository.getCurrentPerformance(portfolioNumber);
        return Objects.requireNonNullElse(currentPerformance, 23.4);
    }
}
