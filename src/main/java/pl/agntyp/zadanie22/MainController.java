package pl.agntyp.zadanie22;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    private MailService mailService;

    public MainController(MailService mailService) {
        this.mailService = mailService;
    }

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("mail", new Mail());
        return "contact";
    }

    @GetMapping("/shipping")
    public String shipping() {
        return "shipping";
    }

    @GetMapping("/thank-you")
    public String thankYou() {
        return "thank-you";
    }

    @PostMapping("/send")
    public String send(Mail mail) {
        mailService.sendMessage(mail);
        return "redirect:/thank-you";
    }
}
