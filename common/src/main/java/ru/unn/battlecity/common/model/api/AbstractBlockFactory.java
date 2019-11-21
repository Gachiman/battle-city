package ru.unn.battlecity.common.model.api;

public interface AbstractBlockFactory {
    AbstractBlock createBlock();
    boolean supportsBlock(Class<?> clazz);
    boolean supports(Class<?> clazz);
}
