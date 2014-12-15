package room.mgang.test;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import room.mgang.web.common.servlet.FrameworkServlet;
@WebServlet("/test.mg")
public class TestServlet extends FrameworkServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * test1方法
	 * @param req
	 * @param res
	 * @return 跳转到test1.html
	 */
	public String test1(HttpServletRequest req,HttpServletResponse res){
		
		return "test1.html";
	}
	
	/**
	 * test2方法
	 * @param req
	 * @param res
	 * @return 跳转到test2.html
	 */
	public String test2(HttpServletRequest req,HttpServletResponse res){
		
		return "test2.html";
	}

}
