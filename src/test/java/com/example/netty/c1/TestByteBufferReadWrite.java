package com.example.netty.c1;

import java.nio.ByteBuffer;

public class TestByteBufferReadWrite {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.put((byte) 0x61); //'a'
        ByteBufferUtil.debugAll(buffer);
        buffer.put(new byte[]{0x62, 0x63, 0x64});// b c d
        ByteBufferUtil.debugAll(buffer);
        buffer.flip();
        System.out.println(buffer.get());
        ByteBufferUtil.debugAll(buffer);
        buffer.compact();
        ByteBufferUtil.debugAll(buffer);
    }
}