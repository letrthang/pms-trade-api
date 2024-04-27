package org.pms.trade.api;


import org.pms.trade.entity.PositionEntity;
import org.pms.trade.entity.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.UUID;

@Service("PositionServicesImpl")
public class PositionServicesImpl implements PositionServices {

    @Autowired
    PositionService positionService;

    @Override
    public Boolean savePosition(String transactionRef, String instrumentId, String tradeType, Integer unit) {
        Boolean ret = false;

        PositionEntity positionEntity = new PositionEntity();

        try {
            positionEntity.setId(UUID.randomUUID().toString());
            positionEntity.setTransaction_ref(transactionRef);
            positionEntity.setInstrument_Id(instrumentId);
            positionEntity.setTrade_type(tradeType);
            positionEntity.setUnit(unit);
            positionService.savePosition(positionEntity);
            ret = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ret;
    }

    public PositionEntity getPosition(@RequestParam("transactionRef") String transactionRef) {
        PositionEntity positionEntity = new PositionEntity();

        try {
            positionEntity.setId(UUID.randomUUID().toString());
            positionEntity.setTransaction_ref("123");
            positionEntity.setInstrument_Id("123456");
            positionEntity.setTrade_type("buy");
            positionEntity.setUnit(1);
            positionService.savePosition(positionEntity);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return positionEntity;
    }

    public List<PositionEntity> getAllPositions() {
        List<PositionEntity> positionEntitiesLst = positionService.getAllPositions();
        return positionEntitiesLst;
    }
}
