package com.example.pdc;

public class PDCUtil {
    static final PdcClient client;
    static {
        client = PdcClientImpl.create("");
    }

    public static PdcClient setUp() {
        return client;
    }
}
