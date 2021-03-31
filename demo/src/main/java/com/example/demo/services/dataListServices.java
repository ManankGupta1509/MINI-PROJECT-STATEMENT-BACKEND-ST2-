package com.example.demo.services;

import com.example.demo.model.dataList;
import com.example.demo.repository.dataListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class dataListServices {

    @Autowired
    private dataListRepository dataListrepository;

    public ArrayList<dataList> getdata() {
        return dataListrepository.getData();
    }

    public void createPost(dataList newPost) {
        dataListrepository.createPost(newPost);
    }

    public void deletePost(Integer postId) {
        dataListrepository.deletePost(postId);
    }
}
