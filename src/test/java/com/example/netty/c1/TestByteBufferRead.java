package com.example.netty.c1;

import java.nio.ByteBuffer;

public class TestByteBufferRead {

    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.put(new byte[]{'a','b','c','d'});
        buffer.flip();//切换至模式
    }
}
