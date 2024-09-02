package shop.mtcoding.springv3.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Integer> {
    // 단순한 crud 가 아닌 것만 구현하면 됨
    // public 은 생략가능. 인터페이스안에 있는건 무조건 public 이니까.
    @Query("select u from User u where u.username=:username")
    User findByUsername(@Param("username") String username); // 추상매서드
}

