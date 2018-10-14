package com.ncell.test.controllers;

import com.ncell.test.models.CategoryExt;
import com.ncell.test.services.WordpressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/wp")
@CrossOrigin
public class WordpressController {

    @Autowired
    private WordpressService wpservice;

    @RequestMapping(value="/getall", method=RequestMethod.GET)
    public List<CategoryExt> getAllCategories(){
        return wpservice.getAllCategories();
    }

}

