package com.seed.cabbage.filter;

import com.seed.cabbage.exception.ContainerException;
import com.seed.cabbage.context.RpcContext;
import com.seed.cabbage.protobuf.ServerDispatcher;

public interface Filter {
    void fireNext(RpcContext context, ServerDispatcher.Dispatcher dispatcher) throws ContainerException;
}
