package com.seed.cabbage.context;


import io.netty.channel.ChannelHandlerContext;

public final class RpcContext {
    ChannelHandlerContext channelContext;

    public ChannelHandlerContext getChannelContext() {
        return channelContext;
    }

    public void setChannelContext(ChannelHandlerContext channelContext) {
        this.channelContext = channelContext;
    }

    /**
     * 初始化context
     * @param channelContext
     * @return
     */
    public static RpcContext initializerContext(ChannelHandlerContext channelContext) {
        RpcContext context = new RpcContext();
        context.setChannelContext(channelContext);
        return context;
    }
}
