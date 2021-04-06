package com.example.blog.demo.blog;

import org.springframework.web.bind.annotation.*;

@RestController
public class httpTestController {

    private static final String TAG="HttpControllerTest:";

    @GetMapping("test/lombok")
  public String lomboktest(Member_test m){
      System.out.println(TAG+"getter"+m.getId());
      m.setId(5010110);
      System.out.println(TAG+"getter"+m.getId());

      Member_test m2=new Member_test();

      return "롬복테스트완료";
  }


    @GetMapping("http/get")
    public String getTest(@RequestParam int id,@RequestParam String password){
        return "get 요청"+id+"  "+ password;
    }

    @GetMapping("http/get2")
    public String get2Test(Member_test m){
        return "get 요청"+m.getId()+" "+ m.getUsername();
    }

    @GetMapping("http/get3")
    public int get3Test(){
        Member_test m2=new Member_test().builder().id(2).build();
        return m2.getId();
    }

    @PostMapping("http/post")
    public String postTest(){
        return "post 요청";
    }
    @PutMapping("http/put")
    public String putTest(){
        return "put 요청";
    }
    @DeleteMapping("http/delete")
    public String deleteTest(){
        return "delete 요청";
    }
}
