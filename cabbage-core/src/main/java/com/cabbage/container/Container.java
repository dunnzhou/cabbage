package com.cabbage.container;

import com.cabbage.container.config.ContainerConfig;
import com.cabbage.container.listener.ContainerListener;
import com.cabbage.container.service.ContainerService;
import com.cabbage.container.status.ContainerState;

import java.util.List;

/**
 * 容器接口
 */
public interface Container {

    void beforeStart();

    Container start();

    void afterStart();

    void beforeStop();

    Container stop();

    void afterStop();

    boolean alive();

    Container init(ContainerConfig containerConfig) throws Exception;

    ContainerConfig getContainerConfig();

    ContainerState state();

    Container changeContainerStae(ContainerState state);

    List<ContainerService> getContainerServiceList();

    boolean addContainerService(ContainerService containerService);

    void addListener(ContainerListener containerListener, ContainerState state);
}
