import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.*;
@WebServlet("/reg")
public class RegServlet extends GenericServlet{
public void service(ServletRequest req,ServletResponse res){
            try{
                PrintWriter pw=res.getWriter();
                String s1=req.getParameter("uname");
                String s2=req.getParameter("pword");
                String s3=req.getParameter("address");
                String s4=req.getParameter("gender");
                String s5=req.getParameter("lang1");
                String s6=req.getParameter("lang2");
                String s7=req.getParameter("lang3");
                String[] s8=req.getParameterValues("hobbies");
                String s9=req.getParameter("country");
                String s10=req.getParameter("uname");
                String s11=req.getParameter("pword");
                pw.println("First Name"+s1);
                pw.println("Last Name"+s2);
                pw.println("Adderess"+s3);
                pw.println("Gender"+s4);
                pw.println("Languages Known:");
                if(s5!=null)
                pw.println(s5);
                if(s6!=null)
                pw.println(s6);
                if(s7!=null)
                pw.println(s7);
                pw.println("Hobbies:");
                for(String s:s8){
                pw.println(s);
                                }
                pw.println("Country"+s9);
                pw.println("User name"+s10);
                pw.println("Password"+s11);
                }catch(Exception e){
                 System.out.println(e);
                                    }
							    }
                                        }