package com.coolweather.app.coolweather.util;

/**
 * Created by cs on 2016/2/21.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
