package workshop.ManyCarts.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CartRepository{

    @Autowired
    public RedisTemplate<String,Object> template;

}