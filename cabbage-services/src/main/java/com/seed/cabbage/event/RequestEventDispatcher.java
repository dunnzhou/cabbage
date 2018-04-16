package com.seed.cabbage.event;

import com.google.common.eventbus.AsyncEventBus;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class RequestEventDispatcher {
    Executor executor = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors());
    AsyncEventBus eventBus = new AsyncEventBus("default", executor);

    public void dispatcher(Object o) {
        eventBus.post(o);
    }
}
