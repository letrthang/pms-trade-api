package org.pms.trade.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


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
        try {
            return repository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            // Handle the exception as needed (e.g., log it, return an empty list, etc.)return Collections.emptyList();
        }

        return null;
    }

}
