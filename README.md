#FrameworkServlet

##快速入门
1.导入frameworkServlet.jar包到自己的工程中<br/>
2.编写TestServlet类继承FrameworkServlet.<br/>
使用servlet3.0的注解配置servlet，在界面上只需要传入action=test1，则调用test1方法来处理请求。

	package room.mgang.test;
	
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	
	import room.mgang.web.common.servlet.FrameworkServlet;
	@WebServlet("/test.mg")
	public class TestServlet extends FrameworkServlet{
	
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
3.在webContent或者webapp下建立三个html页面，用来跳转。<br/>

index.html
----
	<!DOCTYPE HTML>
	<html>
		<head>
			<title>index页面</title>
			<meta charset="utf-8"/>
		</head>
		<body>
			测试FrameworkServlet<br/>
			<a href="test.mg?action=test1">测试test1方法</a><br/>
			<a href="test.mg?action=test2">测试test2方法</a>
		</body>
	</html>
test1.html
----
	<!DOCTYPE HTML>
	<html>
		<head>
			<title>test1页面</title>
			<meta charset="utf-8"/>
		</head>
		<body>
			test1界面。
		</body>
	</html>
test2.html
----
	<!DOCTYPE HTML>
	<html>
		<head>
			<title>test2页面</title>
			<meta charset="utf-8"/>
		</head>
		<body>
			test2界面。
		</body>
	</html>
----
测试通过
##about this
mipo 王老师交给我们的mvc精简点对点控制跳转自定义框架，特此分享。<br/>
qq:1092017732<br/>
blog:http://blog.163.com/mg_blog/<br/>
gitoschina:http://git.oschina.net/mgang<br/>
github:https://github.com/mg0324
		
