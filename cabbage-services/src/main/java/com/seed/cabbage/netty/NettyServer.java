package com.seed.cabbage.netty;

import com.seed.cabbage.netty.channel.ServerChannelInitializer;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollServerSocketChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NettyServer {
    EpollEventLoopGroup IOEventLoop = new EpollEventLoopGroup(Runtime.getRuntime().availableProcessors());
    EpollEventLoopGroup WorkEventLoop = new EpollEventLoopGroup(Runtime.getRuntime().availableProcessors() * 3);


    @Autowired
    ServerChannelInitializer serverChannelInitializer;

    @Bean
    public ServerBootstrap bootstrap() {
        ServerBootstrap bootstrap = new ServerBootstrap().group(IOEventLoop, WorkEventLoop);
        bootstrap.channel(EpollServerSocketChannel.class);
        bootstrap.childHandler(serverChannelInitializer);
        return bootstrap;
    }
}