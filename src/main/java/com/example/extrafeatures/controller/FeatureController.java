package com.example.extrafeatures.controller;

import com.example.extrafeatures.model.Course;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class FeatureController {

    @GetMapping("")
    public String getStarted() {
        return "start";
    }

    @GetMapping("/news")
    public String showNews(Model model){
          return "news";
    }
    @GetMapping("/courses")
    public String index(Model model){
        Course c1 = new Course(1, "Java", new Date(), 5);
        Course c2 = new Course(2, "SQL", new Date(), 5);
        Course c3 = new Course(3, "HTML", new Date(), 5);
        Course c4 = new Course(4, "Test", new Date(), 5);
        List<Course> courses = new ArrayList<>(List.of(c1,c2,c3,c4));
        model.addAttribute("courses", courses);
        return "/courses/index";
    }

}
