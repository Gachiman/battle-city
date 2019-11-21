package ru.unn.battlecity.common.model.impl.factories;

import ru.unn.battlecity.common.model.api.AbstractBlockFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BlockFactoryFacade {
    private static volatile BlockFactoryFacade instance;
    private List<AbstractBlockFactory> factories;

    private BlockFactoryFacade() {
        factories = new ArrayList<>();
        Collections.addAll(factories, new BrickBlockFactory(), new BushBlockFactory(),
                new SteelBlockFactory(), new WaterBlockFactory());
    }

    public static BlockFactoryFacade getInstance() {
        if (instance == null) {
            synchronized (BlockFactoryFacade.class) {
                if (instance == null) {
                    instance = new BlockFactoryFacade();
                }
            }
        }
        return instance;
    }

    @SuppressWarnings("unchecked")
    public <T extends AbstractBlockFactory> T getBlockFactory(Class<T> clazz) {
        return (T) factories.stream()
                .filter(factory -> factory.supports(clazz))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No factory found for type " + clazz));
    }
}
