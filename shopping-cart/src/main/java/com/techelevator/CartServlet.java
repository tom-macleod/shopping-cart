package com.techelevator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.runner.Request;

import java.io.IOException;
 
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
    	boolean doesItExist = checkExistence(request, response, "theCarrot");
    	if (doesItExist) {
    		Carrot tempCarrot = (Carrot) request.getSession().getAttribute("theCarrot");
    		Integer carrotsQuantity = Integer.parseInt(request.getParameter("carrotsQuantity"));
    		tempCarrot.setQuantity(tempCarrot.getQuantity()+carrotsQuantity);
    	} else {
    		Integer carrotsQuantity = Integer.parseInt(request.getParameter("carrotsQuantity"));
    		Carrot theCarrot = new Carrot("Carrot", "3", carrotsQuantity);
    		addToCart(request, response, theCarrot);
    	}
    	useDispatcher(request, response, "/carrot.jsp");
    }
    
    private void doPepper(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	boolean doesItExist = checkExistence(request, response, "thePepper");
    	if (doesItExist) {
    		Pepper tempPepper = (Pepper) request.getSession().getAttribute("thePepper");
    		Integer peppersQuantity = Integer.parseInt(request.getParameter("pepperQuantity"));
    		tempPepper.setQuantity(tempPepper.getQuantity()+peppersQuantity);
    	} else {
    		Integer peppersQuantity = Integer.parseInt(request.getParameter("pepperQuantity"));
    		Pepper thePepper = new Pepper("Pepper", "5", peppersQuantity);
    		addToCart(request, response, thePepper);
    	}
    	useDispatcher(request, response, "/peppers.jsp");
    }
    
    private void doCucumber(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	boolean doesItExist = checkExistence(request, response, "theCucumber");
    	if (doesItExist) {
    		Cucumber tempCucumber = (Cucumber) request.getSession().getAttribute("theCucumber");
    		Integer cucumbersQuantity = Integer.parseInt(request.getParameter("cucumbersQuantity"));
    		tempCucumber.setQuantity(tempCucumber.getQuantity()+cucumbersQuantity);
    	} else {
    		Integer cucumbersQuantity = Integer.parseInt(request.getParameter("cucumbersQuantity"));
    		Cucumber theCucumber = new Cucumber("Cucumber", "8", cucumbersQuantity);
    		addToCart(request, response, theCucumber);
    	}
    	useDispatcher(request, response, "/cucumber.jsp");
    }
    
    private void doTomatoe(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	boolean doesItExist = checkExistence(request, response, "theTomatoe");
    	if (doesItExist) {
    		Tomatoe tempTomatoe = (Tomatoe) request.getSession().getAttribute("theTomatoe");
    		Integer tomatoesQuantity = Integer.parseInt(request.getParameter("tomatoesQuantity"));
    		tempTomatoe.setQuantity(tempTomatoe.getQuantity()+tomatoesQuantity);
    	} else {
    		Integer tomatoesQuantity = Integer.parseInt(request.getParameter("tomatoesQuantity"));
    		Tomatoe theTomatoe = new Tomatoe("Tomatoe", "4", tomatoesQuantity);
    		addToCart(request, response, theTomatoe);
    	}
    	useDispatcher(request, response, "/tomatoes.jsp");
    }
    
    private void doRadish(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	boolean doesItExist = checkExistence(request, response, "theRadish");
    	if (doesItExist) {
    		Radish tempRadish = (Radish) request.getSession().getAttribute("theRadish");
    		Integer radishesQuantity = Integer.parseInt(request.getParameter("radishesQuantity"));
    		tempRadish.setQuantity(tempRadish.getQuantity()+radishesQuantity);
    	} else {
    		Integer radishesQuantity = Integer.parseInt(request.getParameter("radishesQuantity"));
    		Radish theRadish = new Radish("Radish", "18", radishesQuantity);
    		addToCart(request, response, theRadish);
    	}
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
    	boolean doesItExist = checkExistence(request, response, "theCart");
    	if (!doesItExist) {
    		Cart theCart = new Cart();
    		request.getSession().setAttribute("theCart", theCart);
    	}
    }
    
    private boolean checkExistence(HttpServletRequest request, HttpServletResponse response, String theSeed) {
    	boolean checker = false;
    	String[] doesExist = request.getSession().getValueNames();
    	for(String s : doesExist) {
    		if (s.equals(theSeed)) {
    			checker = true;
    		}
    	}
    	return checker;
    }
    
    
    
}