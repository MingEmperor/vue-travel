import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.*;

/**
 * Created by cao on 2018/8/29.
 */
public class Servlet1 extends javax.servlet.http.HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {


        ServletConfig config = this.getServletConfig();
        String sName = config.getServletName();
        System.out.println("当前Servlet 在web.xml中配置的名称:"+sName);
        String value = config.getInitParameter("YourDaddy");
        System.out.println(value);

        response.setContentType("text/html;charSet=GBK");
        String name=request.getParameter("user");
        PrintStream out = new PrintStream(response.getOutputStream());
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("name:"+name);
        out.println("</body>");
        out.println("</html>");

    response.sendRedirect("www.baidu.com");

       /* RequestDispatcher rd = request.getRequestDispatcher("Servlet2");
        rd.forward(request, response);*/

//        RequestDispatcher rd = request.getRequestDispatcher("Servlet2");
//        rd.include(request, response);
    }

    @Override
    public void init() throws ServletException {
        super.init();
        //String s=super.getServletConfig();
        System.out.println("初始化已完成！from YourDaddy.");
    }
}