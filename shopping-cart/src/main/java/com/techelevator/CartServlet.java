package com.techelevator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.runner.Request;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;
 
public class CartServlet extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	String seedType = request.getParameter("seedType");
    	checkCart(request, response);
    	
    	switch(seedType) {
    	case "carrot" :
    		doCarrot(request, response);
    		break;
    	case "pepper" :
    		doPepper(request, response);
    		break;
    	case "cucumber" :
    		doCucumber(request, response);
    		break;
    	case "tomatoes" :
    		doTomatoe(request, response);
    		break;
    	case "radish" :
    		doRadish(request, response);
    		break;
    	}
    }
    
    // *** Methods ***
    
    private void doCarrot(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	Integer carrotsQuantity = Integer.parseInt(request.getParameter("carrotsQuantity"));
    	Carrot theCarrot = new Carrot("Carrot", "3", carrotsQuantity);
    	addToCart(request, response, theCarrot);
    	useDispatcher(request, response, "/carrot.jsp");
    }
    
    private void doPepper(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	Integer peppersQuantity = Integer.parseInt(request.getParameter("pepperQuantity"));
    	Pepper thePepper = new Pepper("Pepper", "5", peppersQuantity);
    	addToCart(request, response, thePepper);
    	useDispatcher(request, response, "/peppers.jsp");
    }
    
    private void doCucumber(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	Integer cucumbersQuantity = Integer.parseInt(request.getParameter("cucumbersQuantity"));
    	Cucumber theCucumber = new Cucumber("Cucumber", "8", cucumbersQuantity);
    	addToCart(request, response, theCucumber);
    	useDispatcher(request, response, "/cucumber.jsp");
    }
    
    private void doTomatoe(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	Integer tomatoesQuantity = Integer.parseInt(request.getParameter("tomatoesQuantity"));
    	Tomatoe theTomatoe = new Tomatoe("Tomatoe", "4", tomatoesQuantity);
    	addToCart(request, response, theTomatoe);
    	useDispatcher(request, response, "/tomatoes.jsp");
    }
    
    private void doRadish(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	Integer radishesQuantity = Integer.parseInt(request.getParameter("radishesQuantity"));
    	Radish theRadish = new Radish("Radish", "18", radishesQuantity);
    	addToCart(request, response, theRadish);
    	useDispatcher(request, response, "/radish.jsp");
    }
    
    private void addToCart(HttpServletRequest request, HttpServletResponse response, Product product) {
    	Cart tempCart = (Cart) request.getSession().getAttribute("theCart");
    	tempCart.addProduct(product);
    }
    
    private void useDispatcher(HttpServletRequest request, HttpServletResponse response, String destination) throws ServletException, IOException {
    	RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(destination);
    	dispatcher.forward(request, response);
    }
    
    private void checkCart(HttpServletRequest request, HttpServletResponse response) {
    	if(request.getSession().getAttribute("theCart") == null) {
    		Cart theCart = new Cart();
    		request.getSession().setAttribute("theCart", theCart);
    	}
    }
    
}