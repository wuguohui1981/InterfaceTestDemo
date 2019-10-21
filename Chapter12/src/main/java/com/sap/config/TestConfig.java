package com.sap.config;

import org.apache.http.client.CookieStore;
import org.apache.http.impl.client.DefaultHttpClient;

public class TestConfig {
    public static String loginUrl;
    public static String updateUserInfourl;
    public static String getUserListUrl;
    public static String getUserInfoUrl;
    public static String addUserUrl;

    public static DefaultHttpClient defaultHttpClient;
    public static CookieStore store;
}
