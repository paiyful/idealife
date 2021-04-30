package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Controller
@RequestMapping("load")
public class LoadController {
    //    MultipartFile类
//    MultipartFile的文件名必须和网页中name值一样
    @RequestMapping("upload")
    public ModelAndView upload(MultipartFile upload) {
//        文件路径
        String path = "D:/apache-tomcat-8.5.60/webapps/upload";
//准备一个路径对应的对象
        File file = new File(path);
//
        if (!file.exists()) {
//         mkdirs()是多级目录，mkdir()单个目录
            file.mkdirs();
        }
//获取上传的文件名
        String filename = upload.getOriginalFilename();
//判断是否为空
        if (filename != null) {
            try {
                upload.transferTo(new File(path, filename));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        ModelAndView modelAndView = new ModelAndView();
//        添加属性键值对
        modelAndView.addObject("imgPath", "http://localhost:8080/upload/" + filename);
//创建响应视图
        modelAndView.setViewName("/success.jsp");

        return modelAndView;
    }

    @RequestMapping("download")
    public void download(String fileName,HttpServletResponse response){
        //声明下载路径
        String path="D:/apache-tomcat-8.5.60/webapps/upload";

        int lastIndexOf = fileName.lastIndexOf("/");

        String name= fileName.substring(lastIndexOf);

        System.out.println(name);
//根据路径和文件名创建一个File对象
        File file = new File(path,name);
//        设置响应告知浏览器以下载的方式打开
        response.setHeader("Content-Disposition","attachment;filename="+ file.getName());
//        声明一个输入和一个输出流
        ServletOutputStream outputStream= null;
        BufferedInputStream inputStream=null;

        try {
            outputStream = response.getOutputStream();
            inputStream = new BufferedInputStream(new FileInputStream(file));

//            获取一个缓冲区
            byte[] buffer = new byte[1024 * 8];
//             如果缓存没有读完
            while(inputStream.read(buffer) != -1){
    //          写入数据
                outputStream.write(buffer);
//                刷新数据
                outputStream.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(inputStream!=null){
                    inputStream.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
            try {
                if(outputStream!=null){
                    outputStream.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
