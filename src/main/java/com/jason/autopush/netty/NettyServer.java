package com.jason.autopush.netty;

import com.jason.autopush.common.util.ThreadUtil;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelHandler;
import io.netty.channel.EventLoopGroup;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Desc
 * @Author jason
 * @CreateTime 2020/5/28 10:39 下午
 **/
@Component
@Slf4j
public class NettyServer implements Runnable{

    @Value("${websocket.server.port}")
    private Integer port;

    @Resource(name = "bossGroup")
    private EventLoopGroup bossGroup;

    @Resource(name = "workerGroup")
    private EventLoopGroup workerGroup;

    @Resource
    private ServerBootstrap serverBootstrap;

    @Resource(name = "childChannelHandler")
    private ChannelHandler childChannelHandler;



    @Override
    public void run() {

    }
}
