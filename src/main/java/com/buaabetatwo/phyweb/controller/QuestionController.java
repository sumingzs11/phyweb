package com.buaabetatwo.phyweb.controller;


import com.buaabetatwo.phyweb.mapper.QuestionMapper;
import com.buaabetatwo.phyweb.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class QuestionController {

    @Autowired
    private QuestionMapper questionMapper;

    @GetMapping("/question")
    public String getQuestion(Model model) {
        List<Question> questionList = questionMapper.findAll();
        model.addAttribute("questionList", questionList);
        return "questionAll";
    }

    @GetMapping("/question-detail")
    public String getQuestion(int id, Model model) {
        Question question = questionMapper.findById(id);
        model.addAttribute("question", question);
        return "question-detail";
    }
}
