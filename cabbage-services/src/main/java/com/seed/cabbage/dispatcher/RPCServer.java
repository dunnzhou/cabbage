package com.seed.cabbage.dispatcher;

import com.google.protobuf.ByteString;
import com.seed.cabbage.protobuf.RpcResponse;
import com.seed.cabbage.protobuf.ServerDispatcher;

public interface RPCServer<T> {
    /**
     * 获取结果
     * @param dispatcher
     * @return
     */
    RpcResponse.Response getResult(ServerDispatcher.Dispatcher dispatcher);

    /**
     * 反序列化消息
     * @param bytes
     * @return
     */
    T decode(ByteString bytes);

    /**
     * 序列化消息
     * @param t
     * @return
     */
    ByteString encode(T t);
}
