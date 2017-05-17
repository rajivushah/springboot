package io.javabrains.springbootstarter.hello;
import org.springframework.web.bind.annotation.RequestMapping;import org.springframework.web.bind.annotation.RestController;
@RestControllerpublic class HelloController {
 @RequestMapping("/hello") public String sayHi() {  return "Hi"; } }
