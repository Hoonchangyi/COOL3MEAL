package com.myapp.test.controller;

import com.myapp.test.model.User;
import com.myapp.test.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/login")
    @CrossOrigin(origins = "http://localhost:3000")
    public User login2(@RequestBody final User params) {
        System.out.println(params.getEmail());
        System.out.println(params.getPass());
        User loginUser = loginService.getUser(params.getEmail());
        System.out.println(params.getPass());
//        System.out.println(loginUser.getPass());

        if(loginUser == null){
            return null;
        }

        else if(params.getPass().equals(loginUser.getPass())){
            return loginUser;
        }

        else {
            return null;
        }
    }

    @RequestMapping(value = "/idCheck", method = RequestMethod.POST)//ID중복체크
    @CrossOrigin(origins = "http://localhost:3000")
    public int idCheck(@RequestBody final User params){

        String userId = params.getEmail();

        User joinUser = this.loginService.getUser(userId);

//        System.out.println(loginUser.getNickname());

        if(joinUser != null){ //읽어온 유저 정보가 있으면 패일

            return 0;
        }
        else {

            return 1;
        }
    }

    @RequestMapping(value = "/nickname", method = RequestMethod.POST)//ID중복체크
    @CrossOrigin(origins = "http://localhost:3000")
    public int nickCheck(@RequestBody final User params){

        String userNickname = params.getNickname();

//        System.out.println(userNickname);

        User joinUser = this.loginService.getNickname(userNickname);

        if(joinUser != null){ //읽어온 유저 정보가 있으면 패일

            return 0;
        }
        else {

            return 1;
        }
    }

    @RequestMapping(value = "/passCheck", method = RequestMethod.POST)//ID중복체크
    @CrossOrigin(origins = "http://localhost:3000")
    public int passCheck(@RequestBody final User params){

        if(!params.getPass().equals(params.getPass2())){ //읽어온 유저 정보가 있으면 패일

            return 0;
        }
        else {

            return 1;
        }
    }

    @RequestMapping(value = "/join", method = RequestMethod.POST)//회원가입
    @CrossOrigin(origins = "http://localhost:3000")
    public int join(@RequestBody final User params){

        System.out.println(params.getEmail());
        System.out.println(params.getPass());
        System.out.println(params.getPass2());
        System.out.println(params.getNickname());
        System.out.println(params.getSex());
        System.out.println(params.getBirth());
        System.out.println(params.getPhone());

        if(this.loginService.insertUser(params) != 0){
            return 1;
        }

        else {
            return 2;
        }
    }
}