package cn.Controller;

import cn.Service.LocklistService;
import cn.VO.Lock;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by tianchang on 2017/7/16.
 */
@Controller
public class LockList {
    @Resource
    private LocklistService locklistService;
    @ResponseBody
    @RequestMapping(value = "/locklist", method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public String locklist(HttpServletRequest request, HttpServletResponse response){
    String phoneNum=request.getParameter("phoneNum");
    return locklistService.locklist(phoneNum);
    }
}
