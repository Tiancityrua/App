package cn.Controller;

import cn.Dao.ValidateDao;
import cn.Service.RegisterService;
import cn.Service.ValidateService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

/**
 * Created by tianchang on 2017/7/14.
 */
@Controller
public class UserValidate {
    @Resource
    private ValidateService validateService;
    @ResponseBody
    @RequestMapping(value = "/validate",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
            public String validate(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
//        request.setCharacterEncoding("utf-8");
//        response.setCharacterEncoding("utf-8");
        String idNum=request.getParameter("idNum");
        System.out.println(idNum);
        return validateService.validate(idNum);
    }
}
