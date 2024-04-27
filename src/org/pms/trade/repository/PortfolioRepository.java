package org.pms.trade.repository;

import org.pms.trade.entity.PortfolioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PortfolioRepository extends JpaRepository<PortfolioEntity, Long> {
    @Query("SELECT p.portfolioValue FROM PortfolioEntity p WHERE p.portfolioNumber = :portfolioNumber")
    Integer getPortfolioValue(String portfolioNumber);

    @Query("SELECT p.currentPerformance FROM PortfolioEntity p WHERE p.portfolioNumber = :portfolioNumber")
    Double getCurrentPerformance(String portfolioNumber);
}
