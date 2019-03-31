package com.controller;

import com.model.Operator;
import com.service.IOperatorService;
import com.util.Tool;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

/**
 * @author chenqi
 * @desc
 * @since 2019-03-31 15:46
 */

@Controller
@RequestMapping("/operator")
public class OperatorController {
    @Resource
    private IOperatorService operatorService;

    //访问登录页
    @RequestMapping("Login")
    public String login(){
        return "Login";
    }

    //框架页
    @RequestMapping("Index")
    public String index(){
        return "Index";
    }

    //框架页-左
    @RequestMapping("Left")
    public String left(){
        return "Left";
    }

    //框架页-主
    @RequestMapping("Main")
    public String main(){
        return "First";
    }

    //框架页-顶
    @RequestMapping("Top")
    public String top(){
        return "Top";
    }

    //验证登录
    @RequestMapping("checkOperator")
    public String checkOperator(Model model,Operator operator, String save,HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException {

        //后端验证登录值非空
        Map<String, String> checkLogin = Tool.checkLogin(operator);
        if(checkLogin.size()==0){//登录值非空
            //判断登录信息是否正确
            List<Operator> list = operatorService.checkOperator(operator);

            if(list.size() != 0){//登录信息正确
                Operator operator1 = new Operator();
                operator1 = list.get(0);
                //设置cookie
                if("1".equals(save)){

                    String name = URLEncoder.encode(operator1.getSzsignonname(), "UTF-8");
                    String pass = URLEncoder.encode(operator1.getSzsignonpassword(), "UTF-8");

                    Cookie cookie1 = new Cookie("c_name",name);
                    Cookie cookie2 = new Cookie("c_pass",pass);

                    cookie1.setMaxAge(60*60*24*7);
                    cookie2.setMaxAge(60*60*24*7);

                    response.addCookie(cookie1);
                    response.addCookie(cookie2);

                }
                //将登录用户信息存到session
                HttpSession session = request.getSession();
                session.setAttribute("operator", operator1);
                return "redirect:Index.do";
            }else{//登录信息不正确
                model.addAttribute("msg", "用户名或密码错误！");
                return "Login";
            }
        }else{//空值登录
            model.addAttribute("msg", "用户名或密码不能为空！");
            return "Login";
        }

    }

    //安全退出
    @RequestMapping("Exit")
    public String exit(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.invalidate();
        return "Index";
    }


}
