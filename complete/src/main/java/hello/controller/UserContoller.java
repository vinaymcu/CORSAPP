///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package hello.controller;
//
//import hello.model.User;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.logging.Logger;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping(value = "/api", produces = {MediaType.APPLICATION_JSON_VALUE})
//public class UserContoller {
//    
//    
//    protected Logger logger = Logger.getLogger(UserContoller.class
//            .getName());
//
//   // @Autowired
//   // protected UserRepository userRepository;
//    
////    @CrossOrigin(origins = "http://127.0.0.1:4200")
////    @GetMapping("/user")
////    public Greeting greeting(@RequestParam(required=false, defaultValue="World") String name) {
////        System.out.println("==== in greeting ====");
////        return new Greeting(counter.incrementAndGet(), String.format(template, name));
////    }
////    
////    
////    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
////    public UserEntity byId(@PathVariable("id") String id) {
////
////        System.out.println("User byId invoked>>>>>>>>>>: " + id);
////        UserEntity cust = userRepository.findOne(Long.parseLong(id));
////
////        return cust;
////    }
////    
//    //@CrossOrigin(origins = "http://localhost:8082")
//    @CrossOrigin(origins = "http://127.0.0.1:4200")
//    @RequestMapping(value = "/users", method = RequestMethod.GET)
//    public List<User> userList() {
//        
//        List<User> userList=new ArrayList<>();
//        User user1=new User();
//        user1.setUserid("1");
//        user1.setUserName("vinay");
//        user1.setUserEmail("vinay@gmail.com");
//        user1.setUserMobile("1111111");
//        user1.setUpdatedAt("delhi");
//        user1.setCreatedAt("vinay");
//        
//        userList.add(user1);
//        
//        User user2=new User();
//        user2.setUserid("2");
//        user2.setUserName("vinay2");
//        user2.setUserEmail("vinay@gmail.com2");
//        user2.setUserMobile("222222");
//        user2.setUpdatedAt("delhi2");
//        user2.setCreatedAt("vinay2");
//        userList.add(user2);
// 
//        System.out.println("userList >>>>>>>: " );
//        
//
//        return userList;
//    }
//   
//    
////    @GetMapping("/greeting-javaconfig")
////    public Greeting greetingWithJavaconfig(@RequestParam(required=false, defaultValue="World") String name) {
////        System.out.println("==== in greetingWithJavaconfig ====");
////        return new Greeting(counter.incrementAndGet(), String.format(template, name));
////    }
//    
//    
//    
////    @RequestMapping(value = "/user", method = RequestMethod.POST)
////    public UserEntity createUser(@RequestBody User user) {
////
////        System.out.println("createUser >>>>>>>: " );
////        UserEntity u=getUserEntity(user);
////        System.out.println("createUser >>>>>>>: " +u);
////        UserEntity userEntity = userRepository.save(u);
////        return userEntity;
////    }
//    
//    
////    private UserEntity getUserEntity(User userRequest){
////        UserEntity user=new UserEntity();
////        
////        user.setUserid(userRequest.getUserid());
////        user.setFirstname(userRequest.getFirstname());
////        user.setLastname(userRequest.getLastname());
////        user.setEmail(userRequest.getEmail());
////        user.setCity(userRequest.getCity());
////        user.setPassword(userRequest.getPassword());
////        user.setIsactive(userRequest.getIsactive());
////                
////        return user;
////    }
//    
//}