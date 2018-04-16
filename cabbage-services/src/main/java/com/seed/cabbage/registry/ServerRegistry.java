package com.seed.cabbage.registry;

import com.google.common.collect.Maps;
import com.seed.cabbage.dispatcher.RPCServer;
import com.seed.cabbage.protobuf.AuthToken;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ServerRegistry {
    Map<String, RPCServer> invokeMapping = Maps.newConcurrentMap();

    public void initializerServerMapping() {
    }
}