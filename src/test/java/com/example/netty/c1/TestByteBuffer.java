package com.example.netty.c1;

import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

@Slf4j
public class TestByteBuffer {
    public static void main(String[] args) {
        //FileChannel
        //1. 输入输出流 1.RandomAccessFile
        try(FileChannel channel = new FileInputStream("data.txt").getChannel()){
            // 准备缓冲区
            ByteBuffer buffer = ByteBuffer.allocate(10);
            while (true){
                // 从 channel 读取数据，向 buffer 写入
                int len = channel.read(buffer);
                log.debug("从缓冲区读到了几个字节：{}", len);
                if(len == -1){ //没有内容了
                    break;
                }
                // 打印 buffer 的内容
                buffer.flip(); //切换到读模式
                while (buffer.hasRemaining()){// 是否还有剩余未读数据
                    byte b = buffer.get();
                    log.debug("读取到的字节 {}", (char)b);
                }
                buffer.clear(); //切换到写模式
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
