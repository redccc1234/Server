package edu.kh.servlet.controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

// servlet 관련 코드를 작성하기 위해서는 HttpServlet 클래스 상속 받아야함
// 상속받았다고 해서 바로 Servlet 등록이 되는 것은 아님!
// -> 방법1. web.xml 작성하기
// -> 방법2.@WebServlect() 어노테이션 사용하기

/* 어노테이션 : 컴파일러가 읽는 주석
 * 
 * @WebServlet 어노테이션
 * -> 해당 클래스를 Servlet으로 등록하고 ( ) 안에 작성된 주소와 
 *    매핑하라고(연결하라고) 지시하는 어노테이션
 * 
 * -> 
 * 
 * 
 * 
 * 
 * 
 * */




@WebServlet("/signUp") 
public class ExampleController2 extends HttpServlet{

}
