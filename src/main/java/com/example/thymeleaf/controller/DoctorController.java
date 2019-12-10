package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
@Controller
public class DoctorController {

    @GetMapping("/doctor")
    public String doctor(Model model,
      @RequestParam(value="name", required=false, defaultValue="John Smith") String name,
      @RequestParam(value="number", required=false, defaultValue="0") int number)

      {
        model.addAttribute("doctorname", name + " and crew");
        model.addAttribute("doctornumber", number);
        return "doctor";
      }
}
