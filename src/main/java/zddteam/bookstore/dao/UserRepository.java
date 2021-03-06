package zddteam.bookstore.dao;

import org.springframework.data.repository.CrudRepository;
import zddteam.bookstore.domain.User;

import javax.transaction.Transactional;

@Transactional
public interface UserRepository extends CrudRepository <User, String> {
    User findByUsername(String username);
    User findByUsernameAndPassword(String username,String password);
}
