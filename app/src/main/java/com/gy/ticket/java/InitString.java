package com.gy.ticket.java;

import com.gy.ticket.R;

/**
 * Created by TWINKLE on 2017/12/19.
 */

public interface InitString {

    public String login_url = "http://119.29.98.60:8080/Cs/LoginServlet";
    public String login_register = "http://119.29.98.60:8080/Cs/RegisterServlet";
    public String login_emailcheck = "http://119.29.98.60:8080/Cs/EmailCheckServlet";
    public String news_url = "http://119.29.98.60:8080/Cs/FilmServlet";
    public String Sing_url = "https://search.damai.cn/external/gl.html?keyword=&siteCity=%E4%B8%8A%E6%B5%B7&destCity=&ctl=%E6%BC%94%E5%94%B1%E4%BC%9A&type=1";
    public String Play_url = "https://search.damai.cn/external/gl.html?keyword=&siteCity=%E4%B8%8A%E6%B5%B7&destCity=&ctl=%E5%BA%A6%E5%81%87%E4%BC%91%E9%97%B2&type=1";
    public int[] pic = new int[]{R.drawable.ftravel, R.drawable.amusement, R.drawable.form};
    public int[] title = new int[]{R.string.travel, R.string.amusement, R.string.form};
    public String[] lv_info = new String[]{"邮箱", "电话号码", "昵称", "居民身份证信息"};
}
