package hello;

import hello.entity.TestUserEntity;
import hello.model.User;
import hello.repository.UserRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api", produces = {MediaType.APPLICATION_JSON_VALUE})
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    UserRepository userRepositoty;

    @CrossOrigin(origins = "http://127.0.0.1:4200")
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<User> userList() {

        System.out.println("userList  0000>>>>>>>: ");

        List<User> usersList = new ArrayList<>();
        List<TestUserEntity> userList = userRepositoty.findAll();

        for (TestUserEntity userEntity : userList) {
            User user = getUserFromEntity(userEntity);
            usersList.add(user);
        }

        System.out.println("userList 11111 >>>>>>>: ");

        return usersList;
    }

//    @GetMapping("/user")
//    public Greeting greeting(@RequestParam(required=false, defaultValue="World") String name) {
//        System.out.println("==== in greeting ====");
//        return new Greeting(counter.incrementAndGet(), String.format(template, name));
//    }
    @GetMapping("/greeting-javaconfig")
    public Greeting greetingWithJavaconfig(@RequestParam(required = false, defaultValue = "World") String name) {
        System.out.println("==== in greetingWithJavaconfig ====");
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @CrossOrigin(origins = "http://127.0.0.1:4200")
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public User createUser(@RequestBody User user) {

        System.out.println("createUser >>>>>>>: ");
        System.out.println("user Details:" + user.getUpdatedAt() + ":CreatedAt:" + user.getCreatedAt());

        TestUserEntity entity = getEntityFromUser(user);
        userRepositoty.save(entity);
         System.out.println(" After persist>>>>>>> User ");
        return user;
    }

    private User getUserFromEntity(TestUserEntity userEntity) {
        User user = new User();

        // user.setUserid(userEntity.getUserid());
        user.setUserName(userEntity.getUser_name());
        user.setUserEmail(userEntity.getUser_email());
        user.setUserPassword(userEntity.getUser_password());
        user.setUserMobile(userEntity.getUser_mobile());
        user.setUpdatedAt(0);
        user.setCreatedAt("Hello");

        return user;
    }

    private TestUserEntity getEntityFromUser(User user) {

        TestUserEntity userEntity = new TestUserEntity();

        // user.setUserid(userEntity.getUserid());
        userEntity.setUser_name(user.getUserName());
        userEntity.setUser_email(user.getUserEmail());
        userEntity.setUser_password(user.getUserPassword());
        userEntity.setUser_mobile(userEntity.getUser_mobile());
        // userEntity.setUpdatedAt(0);
        //userEntity.setCreatedAt("Hello");

        return userEntity;
    }

}
