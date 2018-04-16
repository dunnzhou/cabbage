package com.cabbage.container.codec;

public interface Encoder<Message,Stream> {
    Stream encode(Message message);
}
