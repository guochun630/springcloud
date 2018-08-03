package com.example.httpclient;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * \* User: guojie
 * \* Date: 2018/7/31
 * \* Time: 9:11
 * \* Description:
 * \
 */
public class SendMy {

    public static String send(String url, String id, String pwd, String to, String content) throws IOException {

        CloseableHttpClient client = HttpClients.createDefault();

        HttpPost post = new HttpPost(url);
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("uid", id));
        params.add(new BasicNameValuePair("pwd", pwd));
        params.add(new BasicNameValuePair("tos", to));
        params.add(new BasicNameValuePair("msg", content));
        params.add(new BasicNameValuePair("otime", ""));
        UrlEncodedFormEntity entity = new UrlEncodedFormEntity(params);
        post.setEntity(entity);
        CloseableHttpResponse res = client.execute(post);
        return EntityUtils.toString(res.getEntity());
    }

    public static String sendGet(String url, String id, String pwd, String to, String content) throws IOException {

        CloseableHttpClient client = HttpClients.createDefault();

        url += "?uid=" + id + "&pwd=" + pwd + "&tos=" + to + "&msg=" + content + "&otime=";
        HttpGet get = new HttpGet(url);
        CloseableHttpResponse res = client.execute(get);
        return EntityUtils.toString(res.getEntity());
    }

    public static void main(String[] args) throws IOException {
        String url = "http://service2.winic.org/Service.asmx/SendMessages";
        String pwd = "a123456";
        String to = "18727626760";
        String content = "您所剩余额是:111，总体情况:222";
        String uid = "k2858285";
//        String result = SendMy.send(url, uid, pwd, to, content);
        String result = SendMy.sendGet(url, uid, pwd, to, content);
        System.out.println(result);
    }
}
