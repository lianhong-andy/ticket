package com.qianxunclub.ticket.model;

import com.qianxunclub.ticket.util.HttpUtil;
import org.apache.http.impl.client.BasicCookieStore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhangbin
 * @date 2019-06-08 11:10
 * @description: TODO
 */
public class UserTicketStore {

    public static List<BuyTicketInfoModel> buyTicketInfoModelList = new ArrayList<>();
    public static Map<String, HttpUtil> userBasicCookieStore = new HashMap<>();

    public static void add(BuyTicketInfoModel buyTicketInfoModel) {
        buyTicketInfoModelList.add(buyTicketInfoModel);
    }
}
