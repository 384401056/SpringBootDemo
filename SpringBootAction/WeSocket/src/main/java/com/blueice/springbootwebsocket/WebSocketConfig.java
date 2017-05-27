package com.blueice.springbootwebsocket;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

/**
 * Created by Administrator on 2017/5/27.
 */
@Configuration
@EnableWebSocketMessageBroker //开启使用STOMP协议来传输基于代理的消息.
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer{

    /**
     * 注册STOMP协议的节点(endpoint)，并映射指定的URL.
     * @param registry
     */
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/endpointWisely").withSockJS();
    }

    /**
     * 配置消息代理
     * @param registry
     */
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        super.configureMessageBroker(registry);
        //广播式配置一个/topic消息代理.
        registry.enableSimpleBroker("/topic");
    }
}
