package org.pms.trade.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PositionService {
    private final PositionRepository repository;

    @Autowired
    public PositionService(PositionRepository repo) {
        this.repository = repo;

    }

    public PositionEntity savePosition(PositionEntity position) {
        return repository.save(position);
    }

      public List<PositionEntity> getAllPositions() {
        return positionRepository.findAll();
    }

}
