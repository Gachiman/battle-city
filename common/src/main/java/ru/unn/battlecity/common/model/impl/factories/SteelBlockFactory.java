package ru.unn.battlecity.common.model.impl.factories;

import ru.unn.battlecity.common.model.api.AbstractBlock;
import ru.unn.battlecity.common.model.api.AbstractBlockFactory;
import ru.unn.battlecity.common.model.impl.SteelBlock;

public class SteelBlockFactory implements AbstractBlockFactory {
    @Override
    public AbstractBlock createBlock() {
        return new SteelBlock();
    }

    @Override
    public boolean supportsBlock(Class<?> clazz) {
        return clazz == SteelBlock.class;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz == SteelBlockFactory.class;
    }
}
