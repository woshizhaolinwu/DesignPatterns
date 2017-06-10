package jrdcom.com.justtest.Responsibility;

/**
 * Created by longcheng on 2017/6/10.
 */

public class Request {
    /*
    *请求类
    * 请求内容
    * 请求类别
    * */
    String requestContent;
    int requestType;

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent;
    }

    public void setRequestType(int requestType) {
        this.requestType = requestType;
    }

    public int getRequestType() {
        return requestType;
    }

    public String getRequestContent() {
        return requestContent;
    }
}
