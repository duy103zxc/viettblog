package io.duykhanh471.burogu.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/")
public class HomeController {
    @GetMapping("/")
    public ResponseEntity<String> getMethodName(@RequestParam String param) {
        return new ResponseEntity<>("Homepage", HttpStatus.OK);
    }
}
