package com.resumetree.resumetree.repositories;

import com.resumetree.resumetree.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String>
{
    User findByEmail(String email);
    User save(User user);
}
