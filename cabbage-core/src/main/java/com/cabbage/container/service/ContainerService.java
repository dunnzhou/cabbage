package com.cabbage.container.service;

public interface ContainerService<IMessage, Result> {
    String dispatcherName();

    Result getResult(IMessage message);

    boolean heathCheck();
}