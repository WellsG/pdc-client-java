package com.example.pdc;

import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class PdcRESTCallTest {
    
    private PdcClient client;

    @Before
    public void setUp(){
        System.setProperty("javax.security.auth.useSubjectCredsOnly", "false");
        System.setProperty("sun.security.krb5.debug", "true");
        System.setProperty("jsse.enableSNIExtension", "false");

        HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
            public boolean verify(String hostname, SSLSession session) {
                return true;
            }
        });
        client = PDCUtil.setUp();
    }

    @Test
    //@Ignore
    public void testListProds() throws Exception {
        List<Product> prods = client.listProducts();
        for(Product p: prods){
            System.out.println(p.getShortName());
        }
        assertNotNull(prods);
    }

    @Test
    public void testGetReleases() throws Exception {
        List<Release> releases = client.getReleases("rhel-7");
        assertNotNull(releases);
    }

    @Test
    public void testGetGlobalComps() throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("name", "python");
        List<GlobalComponent> globalComps = client.getGlobalComps(params);
        assertNotNull(globalComps);
    }

}
