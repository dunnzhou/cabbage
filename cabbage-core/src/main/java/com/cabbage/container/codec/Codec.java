package com.cabbage.container.codec;

public interface Codec<Stream, IMessage, IResult> {
    Decoder<Stream, IMessage> getDecoder();
    Encoder<IResult, Stream> getEncoder();
}
