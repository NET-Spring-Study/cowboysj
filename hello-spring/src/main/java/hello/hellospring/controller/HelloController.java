package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {
    @GetMapping("hello") //"/"뒤에 hello가 붙으면 아래 실행함
    public String hello(Model model){
        model.addAttribute("data", "hello!!");
        return "hello";


    }
    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam(value = "name", required = false) String name, Model model){
        model.addAttribute("name", name); //required는 default false
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody // 데이터가 그대로 넘어감
    public String helloString(@RequestParam("name") String name){
        return "hello "+name;
    }

    //api
    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    static class Hello {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
