package com.example.netty.c1;

import java.nio.ByteBuffer;

import static com.example.netty.c1.ByteBufferUtil.debugAll;

public class TestByteBufferRead {

    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.put(new byte[]{'a','b','c','d'});

        //切换至读模式
        buffer.flip();

        buffer.get(new byte[4]);
        debugAll(buffer);

        buffer.rewind();
        System.out.println((char) buffer.get());
    }
}
