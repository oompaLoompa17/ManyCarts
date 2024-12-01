package workshop.ManyCarts.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
import workshop.ManyCarts.models.User;
import static workshop.ManyCarts.models.User.getUser;

@Controller
@RequestMapping
public class CartController {
    
    @GetMapping("/carts")
    public String getCarts(@RequestParam String uid, Model model, HttpSession session){

        User user = getUser(session, uid);
        
    
        // bind user's name (uid) to "cart-list" view
        model.addAttribute("uid", uid);
        model.addAttribute("carts", user.getCarts());
        return "cart-list";
    }

    // @GetMapping("/cart/{cartId}")
    // public String newCart(){

    // }
}
