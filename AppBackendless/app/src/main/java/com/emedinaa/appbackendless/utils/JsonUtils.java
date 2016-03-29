package com.emedinaa.appbackendless.utils;

import com.google.gson.Gson;

import org.json.JSONObject;

/**
 * Created by emedinaa on 29/10/2014.
 */
public class JsonUtils {

    public static String generateJSONObject(Object obj)
    {
        Gson gson = new Gson();
        String json = gson.toJson(obj);
        return json;
    }
}
