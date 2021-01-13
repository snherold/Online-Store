package com.sherold.store.Controllers;

import com.sherold.store.DTO.CartDto;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    //testing only
    @GetMapping("/all")
    public CartDto getAllCarts() {
        //TODO:
        return new CartDto();
    }

    @PostMapping("/add/{itemId}")
    public boolean addToCart(@PathVariable("itemId") int itemId) {
        //TODO:
        return true;
    }

    @PostMapping(value = {"/remove/{itemId}", "/remove/{itemId}/{amount}"})
    public boolean removeFromCart(@PathVariable("itemId") int itemId, @PathVariable("amount") Optional<Integer> amount) {
        if (amount.isPresent()) {
            //TODO:
        }
        else {
            //TODO:
        }
        return true;
    }
}
