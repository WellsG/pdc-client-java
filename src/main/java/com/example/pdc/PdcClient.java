package com.example.pdc;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;


public interface PdcClient {

	public void auth() throws Exception;

	public List<Product> listProducts() throws Exception;

	public List<Release> getReleases(String prodVersion) throws Exception;

	public Release getRelease(String releaseId) throws Exception;

	public ReleaseComponent createReleaseComp(String name, String release, String globalComponent) throws Exception;

	public List<ReleaseComponent> getReleaseComps(Map<String,String> params) throws Exception;

	public GlobalComponent createGlobalComp(String name) throws Exception;

	public List<GlobalComponent> getGlobalComps(Map<String, String> parmas) throws Exception;

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;

}
