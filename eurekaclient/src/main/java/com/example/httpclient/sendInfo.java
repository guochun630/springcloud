package com.example.httpclient;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * \* User: guojie
 * \* Date: 2018/7/31
 * \* Time: 9:00
 * \* Description:
 * \
 */
public class sendInfo {

    public static String send(String url, String id, String pwd, String to, String content) throws IOException {

        CloseableHttpClient client = HttpClients.createDefault();

        HttpPost post = new HttpPost(url);
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("id", id));
        params.add(new BasicNameValuePair("pwd", pwd));
        params.add(new BasicNameValuePair("to", to));
        params.add(new BasicNameValuePair("content", content));
        UrlEncodedFormEntity entity = new UrlEncodedFormEntity(params);
        post.setEntity(entity);
        CloseableHttpResponse res = client.execute(post);
        return EntityUtils.toString(res.getEntity());
    }

    public static void main() throws IOException {
        String url = "http://service.winic.org/sys_port/gateway/index.asp";
        String id = "k2858285";
        String pwd = "a123456";
        String to = "18696138391";
        String content = "您好，您的账户余额是【11223344】";
        String result = sendInfo.send(url, id, pwd, to, content);
        System.out.println(result);
    }
}
