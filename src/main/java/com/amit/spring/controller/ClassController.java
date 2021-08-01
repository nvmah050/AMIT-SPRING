package com.amit.spring.controller;

import com.amit.spring.model.Class;
import com.amit.spring.model.request.AddClassRequest;
import com.amit.spring.model.response.BaseResponse;
import com.amit.spring.model.utils.ApiException;
import com.amit.spring.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/class")
public class ClassController {
    @Autowired
    private ClassService classService;
 // list
//
    @GetMapping
    public BaseResponse<List<Class>> getAllClass() throws ApiException{
        return classService.getAllClass();
    }



    // tim kiem theo ten

 // tim kiem theo id

 // tao
    @PostMapping
    public BaseResponse<String> getAllClass(@RequestBody AddClassRequest request) throws ApiException{
        return classService.createdClass(request);
    }

 // sưa

 // xoa

// danh sach sinh vien

// tong diem so
}
