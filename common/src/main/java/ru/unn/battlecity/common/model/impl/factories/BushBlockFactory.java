package ru.unn.battlecity.common.model.impl.factories;

import ru.unn.battlecity.common.model.api.AbstractBlock;
import ru.unn.battlecity.common.model.api.AbstractBlockFactory;
import ru.unn.battlecity.common.model.impl.BushBlock;

public class BushBlockFactory implements AbstractBlockFactory {
    @Override
    public AbstractBlock createBlock() {
        return new BushBlock();
    }

    @Override
    public boolean supportsBlock(Class<?> clazz) {
        return clazz == BushBlock.class;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz == BushBlockFactory.class;
    }
}
