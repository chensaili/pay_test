package csl.pay;

import com.alibaba.fastjson.JSON;

import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 * 条码付付款成功后，会得到一个json字符串，使用如下的方法进行解析
 *
 */
public class App 
{
    public static void main( String[] args ) {
        String json = "{\"alipay_trade_pay_response\":{\"code\":\"10000\",\"msg\":\"Success\",\"buyer_logon_id\":\"kvi***@sandbox.com\",\"buyer_pay_amount\":\"0.01\",\"buyer_user_id\":\"2088102170221273\",\"fund_bill_list\":[{\"amount\":\"0.01\",\"fund_channel\":\"ALIPAYACCOUNT\"}],\"gmt_payment\":\"2017-06-15 23:06:26\",\"invoice_amount\":\"0.01\",\"open_id\":\"20880038359752799212582612714327\",\"out_trade_no\":\"de0255710ed84cbdb5cd3f212cacc070\",\"point_amount\":\"0.00\",\"receipt_amount\":\"0.01\",\"total_amount\":\"0.01\",\"trade_no\":\"2017061521001004270200314093\"},\"sign\":\"UY8zCR1LFGNbWgxj/Im1eAVFt9E5SFOra6uASnRc/2Ia0Y46pOvx52HlsWOSetBEb9HEPcJ5MP42D/0CnEGc/FtXMHiaIPcSq/b52KNsKSzFQXFU+xxn/QKqkfi6MZEfjIqwzm7WWQTT1Y3sfFVyMCjDoFN8FobNXdw/U2kqYqA=\"}";
        //得到alipay_trade_pay_response的值并添加至TreeMap中，这里进行自然排序
        TreeMap response = new TreeMap(JSON.parseObject(json).getJSONObject("alipay_trade_pay_response"));
        //链式，按添加顺序进行排序
        LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("code", response.remove("code") );
        linkedHashMap.put("msg", response.remove("msg") );
        linkedHashMap.putAll(response);
        String sginText = JSON.toJSONString(linkedHashMap);
        System.out.println(sginText);
    }
}
