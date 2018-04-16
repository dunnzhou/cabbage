package com.cabbage.container.registry;

import com.cabbage.container.Container;

public interface ContainerRegistry {

    /**
     * 注册容器
     * @param container
     */
    void register(Container container);

    /**
     * 销毁容器
     * @param container
     */
    void destroy(Container container);
}
