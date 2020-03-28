package com.example.atv2.controller;

import com.example.atv2.service.meuservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class meucontrolador {

    @Autowired
    private meuservice ser;

    @GetMapping("/carros/{id}")
    public ModelAndView getCar(@PathVariable("id") int id) {
        ModelAndView mv = new ModelAndView("carro");
        mv.addObject("carro", ser.getCar(id));
        return mv;
    }

    @GetMapping("/carros")
    public ModelAndView getCars() {
        ModelAndView mv = new ModelAndView("disponivel");
        mv.addObject("carros", ser.getCars());
        return mv;
    }
}