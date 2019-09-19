package pl.baroman.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.baroman.dao.TestDao;

@Controller
public class TestController {
    @Autowired
    TestDao testDao;

    @RequestMapping("/")
    @ResponseBody
    public String setTestEntity(){
        testDao.saveTestEntity();
        return "Added test";
    }
}
