package com.seed.cabbage.netty.channel;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.timeout.IdleStateEvent;
import org.slf4j.LoggerFactory;

public class IdleServerHandler extends ChannelInboundHandlerAdapter {

    public org.slf4j.Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (evt instanceof IdleStateEvent) {
            IdleStateEvent event = (IdleStateEvent) evt;
            if (log.isDebugEnabled()) {
                log.debug(ctx.channel().remoteAddress()+" 触发事件：" + event.state());
            }
        } else {
            super.userEventTriggered(ctx, evt);
        }
    }
}
