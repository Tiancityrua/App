package cn.Controller;

import cn.Service.GatewayService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by tianchang on 2017/7/18.
 */
@Controller
public class GateWay {
    @Resource
    private GatewayService gatewayService;
    @ResponseBody
    @RequestMapping(value = "/gateway", method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public String gateway(){
        return gatewayService.gateway();
    }
}
