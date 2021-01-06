package com.example.demo.controller.user;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.annotation.ResponseResultBody;
import com.example.demo.enums.ResultStatus;
import com.example.demo.exception.ResultException;
import com.example.demo.utils.Result;

@RestController
@RequestMapping("/hello")
@ResponseResultBody
public class UserController {
	private static final HashMap<String, Object> INFO;
	 
    static {
        INFO = new HashMap<>();
        INFO.put("name", "galaxy");
        INFO.put("age", "70");
    }
 
    @GetMapping("/hello")
    public Map<String, Object> hello() {
        return INFO;
    }
 
    @GetMapping("/result")
    public Result<Map<String, Object>> helloResult() {
        return Result.success(INFO);
    }
    
    @GetMapping("/str")
    public String strResult() throws Exception{
    	throw new ResultException(ResultStatus.SUCCESS);
    }

    @GetMapping("/test")
    public String testResult() throws Exception{
    	return "自动化部署成功";
    }
}
