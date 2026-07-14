package com.kashish.demo.Portfolio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyPortfolio {


    }
    @GetMapping("/myself")
    public String mySelf() {
        return "<h1>Kashish Pandey</h1>" +
                "<h3>Software Engineer Aspirant | Cyber Security Enthusiast</h3>" +
                "<p>I am a Computer Science Engineering student at Lovely Professional University.</p>" +
                "<p>I am focused, hardworking, and passionate about software development, problem solving, and cybersecurity.</p>" +
                "<ul>" +
                "<li><b>GitHub:</b> https://github.com/Kashish-pandey</li>" +
                "<li><b>LeetCode:</b> https://leetcode.com/u/kashish0613/</li>" +
                "<li><b>LinkedIn:</b> https://www.linkedin.com/in/kashish-pandey06/</li>" +
                "<li><b>Email:</b> kashishpandey494@gmail.com</li>" +
                "</ul>";
    }


}