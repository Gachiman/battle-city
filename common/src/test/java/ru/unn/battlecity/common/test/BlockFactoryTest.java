package ru.unn.battlecity.common.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.unn.battlecity.common.model.api.AbstractBlock;
import ru.unn.battlecity.common.model.impl.BrickBlock;
import ru.unn.battlecity.common.model.impl.BushBlock;
import ru.unn.battlecity.common.model.impl.SteelBlock;
import ru.unn.battlecity.common.model.impl.WaterBlock;
import ru.unn.battlecity.common.model.impl.factories.*;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class BlockFactoryTest {
    private BlockFactoryFacade factories;

    @BeforeEach
    public void init() {
        factories = BlockFactoryFacade.getInstance();
    }

    @Test
    public void testBrickFactory() {
        AbstractBlock block = factories.getBlockFactory(BrickBlockFactory.class).createBlock();
        assertThat(block, instanceOf(BrickBlock.class));
    }

    @Test
    public void testBushFactory() {
        AbstractBlock block = factories.getBlockFactory(BushBlockFactory.class).createBlock();
        assertThat(block, instanceOf(BushBlock.class));
    }

    @Test
    public void testSteelBlock() {
        AbstractBlock block = factories.getBlockFactory(SteelBlockFactory.class).createBlock();
        assertThat(block, instanceOf(SteelBlock.class));
    }

    @Test
    public void testWaterBlock() {
        AbstractBlock block = factories.getBlockFactory(WaterBlockFactory.class).createBlock();
        assertThat(block, instanceOf(WaterBlock.class));
    }
}
