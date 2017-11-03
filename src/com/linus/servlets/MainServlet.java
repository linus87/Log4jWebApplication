package com.linus.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static Logger logger = LogManager.getLogger(MainServlet.class.getName()) ;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		logger.debug("System property user.dir: " + System.getProperty("user.dir"));
		
//		logger.error(MainServlet.class.getName());
//		Properties props = System.getProperties();
//		Iterator<Object> iter = props.keySet().iterator();
//		while (iter.hasNext()) {
//			String key = (String)iter.next();
//			logger.debug(key + " : " + props.getProperty(key));
//		}
		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			Driver driver = DriverManager.getDriver("jdbc:mysql://localhost:3306/log4jwebapplication?username=linus&password=Ux9ae4mGKafa9hjX");
			
//			System.out.println(driver.getClass().getName());
			
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/log4jwebapplication", "linus", "Ux9ae4mGKafa9hjX");
//			System.out.print("closed: " + con.isClosed());
//			System.out.println("Hello world");
		} catch (Exception e) {
			e.printStackTrace();
//			logger.debug(e.getMessage());
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
