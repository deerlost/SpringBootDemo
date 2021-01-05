package com.netty.client;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;
import io.netty.util.ReferenceCountUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description TODO
 * @ClassName： :
 * @Package
 * @anthor：wyang
 * @date：
 * @版本：V1.0
 */
public class NettyDemoHandler extends SimpleChannelInboundHandler<String> {
    private static Logger logger = LoggerFactory.getLogger(NettyDemoHandler.class);

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        super.channelInactive(ctx);
        // 连接失效
        ctx.close();
    }

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        super.userEventTriggered(ctx, evt);
        if (evt instanceof IdleStateEvent) {
            IdleStateEvent e = (IdleStateEvent) evt;
            if (e.state() == IdleState.WRITER_IDLE) {
                // 空闲了，发个心跳吧

                ctx.writeAndFlush("message.toJson()");
            }
        }
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
        logger.debug("receive ping from server {}", msg);

        ReferenceCountUtil.release(msg);
    }
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("进入微信墙模式，清发消息:");
        ctx.writeAndFlush("msg");
    }


}

