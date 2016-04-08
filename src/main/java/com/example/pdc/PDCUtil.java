package com.example.pdc;

public class PDCUtil {
    static final PdcClient client;
    static {
        client = PdcClientImpl.create("https://pdc-dt.host.qe.eng.pek2.redhat.com/rest_api/v1/");
    }

    public static PdcClient setUp() {
        return client;
    }
}
