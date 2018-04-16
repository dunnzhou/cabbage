package com.seed.cabbage.netty.channel;

import com.google.common.collect.Lists;
import io.netty.channel.ChannelHandler;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomChannelAdapter {

    List<ChannelHandler> handlerList = Lists.newLinkedList();

    public List<ChannelHandler> getCustomChannelHandler() {
        return handlerList;
    }
}
