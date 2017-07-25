package cn.Controller;

import cn.Dao.OpenlockDao;
import cn.Service.OpenlockService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by tianchang on 2017/7/17.
 */
@Controller
public class OpenLock {
    @Resource
    private OpenlockService openlockService;
    @ResponseBody
    @RequestMapping(value = "/openlock", method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
            public String openlock(HttpServletRequest request,HttpServletResponse response){
        String phoneNum=request.getParameter("phoneNum");
        String lockPwd=request.getParameter("lockPwd");
        String phoneIdentifier=request.getParameter("phoneIdentifier");
        return openlockService.openlock(phoneNum,lockPwd,phoneIdentifier);
//        return openlockService.openlock("17816876192","123456","898602D1111491007096");
        }
    }

