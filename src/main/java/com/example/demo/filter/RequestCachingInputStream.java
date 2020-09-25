package com.example.demo.filter;

import javax.servlet.ReadListener;
import javax.servlet.ServletInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class RequestCachingInputStream extends ServletInputStream {
    private final ByteArrayInputStream inputStream;

    public RequestCachingInputStream(ByteArrayInputStream byteArrayInputStream) {
        this.inputStream = byteArrayInputStream;
    }

    @Override
    public boolean isFinished() {
        return inputStream.available() == 0;
    }

    @Override
    public boolean isReady() {
        return true;
    }

    @Override
    public void setReadListener(ReadListener listener) {

    }

    @Override
    public int read() throws IOException {
        return inputStream.read();
    }
}