package main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * Created by JiaHao on 2017/2/14.
 */

@Controller
public class Home {

    @RequestMapping(value = "list",method = RequestMethod.GET)
    public  @ResponseBody
    ArrayList<String> list(){
        ArrayList<String> array = new ArrayList<String>();
        array.add("test");
        array.add("test2");
        array.add("test");
        array.add("test2");
        array.add("test");
        array.add("test2");
        array.add("test");
        array.add("test2");
        return  array;
    }

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public  @ResponseBody People user(){
        People p = new People();
        p.setAge("16");
        p.setName("lily");
        return p;
    }


    @RequestMapping(value = "/home",method = RequestMethod.GET)
    @ResponseBody
    public  String home(){
        return  "home";
    }


    @RequestMapping(value="/userself")
    public ModelAndView index(){
        Map<String, String> map = new HashMap<String, String>();

        ModelAndView modelAndView = new ModelAndView("/myName");
        modelAndView.addObject("name", "Silicn的测试页面");
        modelAndView.addObject("nihao","传值：");
        return modelAndView;
    }


    @RequestMapping(value = "/hehe",method = RequestMethod.GET)
    @ResponseBody
    public  Map<String, Object> hehe(ModelMap map){

        Map<String,Object> mode = new HashMap<String, Object>();

//        map.addAttribute("name","silicn");
        mode.put("nihao","shi");
//        map.addAttribute("state","200");
        mode.put("state",200);
        ArrayList<String> array = new ArrayList<String>();

        array.add("first");
        array.add("second");

        mode.put("data",array);

        return mode;
    }



}
