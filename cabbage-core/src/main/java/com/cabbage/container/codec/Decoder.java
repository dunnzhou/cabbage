package com.cabbage.container.codec;

public interface Decoder<Message,Stream> {
    Message decode(Stream stream);
}
