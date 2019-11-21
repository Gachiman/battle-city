package ru.unn.battlecity.common.model.impl.factories;

import ru.unn.battlecity.common.model.api.AbstractBlock;
import ru.unn.battlecity.common.model.api.AbstractBlockFactory;
import ru.unn.battlecity.common.model.impl.BrickBlock;

public class BrickBlockFactory implements AbstractBlockFactory {
    @Override
    public AbstractBlock createBlock() {
        return new BrickBlock();
    }

    @Override
    public boolean supportsBlock(Class<?> clazz) {
        return clazz == BrickBlock.class;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz == BrickBlockFactory.class;
    }
}
