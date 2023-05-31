package com.example.huynhanvu2.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import Model.Contact;

@Controller
@RequestMapping
public class ContactController {
    @GetMapping("/contact")
    public String showContactForm(Model model) {
        model.addAttribute("contact", new Contact());
        return "Home/contact";
    }

    @PostMapping("/contact")
    public String submitContactForm(@ModelAttribute("contact") Contact contact, Model model) {

        model.addAttribute("contact", contact);
        return "Home/result";

    }
}
