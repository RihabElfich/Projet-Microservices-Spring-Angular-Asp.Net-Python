//package com.example.videocall;
//
//
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.view.RedirectView;
//
//import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
//
//@RestController
//@RequestMapping("/api/v1/users")
//@RequiredArgsConstructor
//@Slf4j
//public class UserControler {
//
//    @GetMapping("/videocall/{username}/{email1}/{email2}")
//    public RedirectView meetingcreating(@PathVariable String email1,@PathVariable String email2,@PathVariable String username ){
//        return new RedirectView("/videocall.html?username="+username+"&roomID="+email1+email2);
//    }
//
//
//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<String> handle(Exception ex) {
//        ex.printStackTrace();
//        return ResponseEntity
//                .status(INTERNAL_SERVER_ERROR)
//                .body(ex.getMessage());
//    }
//}
//
package com.example.videocall;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
@Slf4j
public class UserControler {  // Corrected class name

    @GetMapping("/videocall/{username}/{email1}/{email2}")
    public RedirectView meetingCreating(@PathVariable String username, @PathVariable String email1, @PathVariable String email2) {  // Corrected method name and parameter order
        return new RedirectView("/videocall.html?username=" + username + "&roomID=" + email1 + email2);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handle(Exception ex) {
        ex.printStackTrace();
        return ResponseEntity
                .status(INTERNAL_SERVER_ERROR)
                .body(ex.getMessage());
    }
}
