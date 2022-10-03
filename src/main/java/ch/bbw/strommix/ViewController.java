package ch.bbw.strommix;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ViewController
 * 
 * @author Peter Rutschmann
 * @date 23.09.2022
 */
@Controller
public class ViewController {

    @GetMapping("/")
    public String redirect() {
        return "redirect:/strommix";
    }

    @GetMapping("/strommix")
    public String showView(Model model) {
        model.addAttribute("strommix", "--");
        return "infoView";
    }

    @PostMapping(value = "/strommix", params = { "numberbutton=one" })
    public String showViewOne(Model model) {
        model.addAttribute("strommix", "53% Wasserkraft");
        return "infoView";
    }

    @PostMapping(value = "/strommix", params = { "numberbutton=two" })
    public String showViewTwo(Model model) {
        model.addAttribute("strommix", "40% Kernenergie");
        return "infoView";
    }

    @PostMapping(value = "/strommix", params = { "numberbutton=three" })
    public String showViewThree(Model model) {
        model.addAttribute("strommix", "7% Rest");
        return "infoView";
    }
}
