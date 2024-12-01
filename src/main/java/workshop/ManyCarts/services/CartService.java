package workshop.ManyCarts.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import workshop.ManyCarts.repositories.CartRepository;

@Service
public class CartService {

    @Autowired
    public CartRepository cartRepo;

}
