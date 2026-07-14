package com.kashish.demo.Portfolio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyPortfolio {

    @GetMapping("/")
    public String portfolio() {
        return mySelf() + skills() + edu() + projects();
    }

    public String mySelf() {
        return "<h1>Kashish Pandey</h1>" +
                "<h3>Software Engineer Aspirant | Cyber Security Enthusiast</h3>" +
                "<p>I am a Computer Science Engineering student at Lovely Professional University.</p>" +
                "<p>I am focused, hardworking, and passionate about software development and problem solving.</p>" +
                "<hr>";
    }

    public String skills() {
        return "<h2>Skills</h2>" +
                "<ul>" +
                "<li>C</li>" +
                "<li>C++</li>" +
                "<li>Java</li>" +
                "<li>MySQL</li>" +
                "<li>MongoDB</li>" +
                "<li>Git & GitHub</li>" +
                "<li>Linux</li>" +
                "<li>Postman</li>" +
                "</ul>" +
                "<hr>";
    }

    public String edu() {
        return "<h2>Education</h2>" +
                "<h3>Lovely Professional University</h3>" +
                "<p>B.Tech CSE | CGPA: 7.68 | 2023 - Present</p>" +

                "<h3>St. Xaviers School</h3>" +
                "<p>Intermediate (PCM) | 76%</p>" +

                "<h3>Gyan Kunj Academy</h3>" +
                "<p>Matriculation | 70%</p>" +
                "<hr>";
    }

    public String projects() {
        return "<h2>Projects</h2>" +

                "<h3>Find Car Owner</h3>" +
                "<p>Vehicle information retrieval application built using Python, Flask, HTML and CSS.</p>" +

                "<h3>Brute Force Simulation Tool</h3>" +
                "<p>Cybersecurity simulation tool demonstrating brute-force attacks and password security.</p>" +

                "<hr>" +
                "<h2>Profiles</h2>" +
                "<ul>" +
                "<li>GitHub: https://github.com/Kashish-pandey</li>" +
                "<li>LinkedIn: https://linkedin.com/in/kashish-pandey06</li>" +
                "<li>LeetCode: https://leetcode.com/u/kashish0613/</li>" +
                "</ul>";
    }
}