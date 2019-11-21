package ru.unn.battlecity.common.model.impl.factories;

import ru.unn.battlecity.common.model.api.AbstractBlock;
import ru.unn.battlecity.common.model.api.AbstractBlockFactory;
import ru.unn.battlecity.common.model.impl.WaterBlock;

public class WaterBlockFactory implements AbstractBlockFactory {
    @Override
    public AbstractBlock createBlock() {
        return new WaterBlock();
    }

    @Override
    public boolean supportsBlock(Class<?> clazz) {
        return clazz == WaterBlock.class;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz == WaterBlockFactory.class;
    }
}
