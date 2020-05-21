package com.jason.autopush;

import com.jason.autopush.websocket.WebSocketServer;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * 当SpringBoot启动后,加载这个类
 *
 * @author mac
 */
@Component
@Slf4j
public class NettyBooter implements ApplicationListener<ContextRefreshedEvent> {

    private static final Logger logger = LoggerFactory.getLogger(NettyBooter.class);

    @Value("${jason.server.port}")
    private String wsPort;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        if (event.getApplicationContext().getParent() == null) {
            //事件获得上下文对象化后启动服务器
            try {
                WebSocketServer.getInstance()
                        .start(wsPort);
            } catch (Exception e) {
                logger.error(e.getMessage(), e);
            }
        }
    }


}
