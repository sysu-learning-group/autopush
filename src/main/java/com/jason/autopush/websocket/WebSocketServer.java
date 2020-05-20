package com.jason.autopush.websocket;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.springframework.stereotype.Component;

/**
 * @Desc
 * @Author jason
 * @CreateTime 2020/5/19 10:52 下午
 **/
@Component
public class WebSocketServer {

    /**
     * 静态内部类声明
     */
    private static class SingletonWSSever {
        static final WebSocketServer instance = new WebSocketServer();
    }

    public static WebSocketServer getInstance(){
        return SingletonWSSever.instance;
    }

    private NioEventLoopGroup boss;
    private NioEventLoopGroup worker;
    private ServerBootstrap serverBootstrap;
    private ChannelFuture channelFuture;

    private WebSocketServer(){
        boss = new NioEventLoopGroup();
        worker = new NioEventLoopGroup();
        serverBootstrap = new ServerBootstrap();
        serverBootstrap.group(boss, worker)
                .channel(NioServerSocketChannel.class)
                .childHandler(new Websocketserver)

    }

}
