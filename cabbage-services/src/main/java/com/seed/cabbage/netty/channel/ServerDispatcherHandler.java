package com.seed.cabbage.netty.channel;

import com.seed.cabbage.context.RpcContext;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import com.seed.cabbage.protobuf.ServerDispatcher.Dispatcher;
import org.springframework.stereotype.Component;

@Component
@ChannelHandler.Sharable
public final class ServerDispatcherHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        Dispatcher dispatcher = (Dispatcher)msg;
        RpcContext rpcContext  = RpcContext.initializerContext(ctx);

    }
}
