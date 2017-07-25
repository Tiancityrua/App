package cn.Service;

import cn.VO.User;

/**
 * Created by tianchang on 2017/7/12.
 */
public interface RegisterService {
    String  register(String idNum,String passWord,String phoneIdentifier,String phoneNum);
}
