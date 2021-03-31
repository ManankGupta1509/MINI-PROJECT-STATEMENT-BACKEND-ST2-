package com.example.demo.controler;

import com.example.demo.model.dataList;
import com.example.demo.services.dataListServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class dataListControler {

    @Autowired
    private dataListServices datalistservices;

    @RequestMapping(method = RequestMethod.GET,value = "/index")
    public ArrayList<dataList> getdata(Model model){
        ArrayList<dataList> data=datalistservices.getdata();
        model.addAttribute("datalist",data);
                return data;
    }

    @RequestMapping(method = RequestMethod.POST,value = "/create")
    public String createNewPost(dataList newPost)
    {
        datalistservices.createPost(newPost);
        return "redirect:/index";
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/delete")
    public String deletePost(@RequestParam(name = "postId") Integer postId){
        datalistservices.deletePost(postId);
        return "redirect:/index";
    }

}
