package com.lfboo.demo.controller;

import com.lfboo.demo.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by on 2018/8/5.
 *
 * @author lfb
 */
@Controller
public class IndexController {

    @Resource
    private IndexService indexService;

    @ResponseBody
    @RequestMapping("/index")
    public Object index() {
        String msg = indexService.sayHello("lvfeibiao");

        Map<String,Object> result = new HashMap<>();
        result.put("msg", msg);
        return result;
    }

}
