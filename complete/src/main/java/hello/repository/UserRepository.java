
package hello.repository;


import hello.entity.TestUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<TestUserEntity, Long>{
    
}
