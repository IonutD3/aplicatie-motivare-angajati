

import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;


@WebServlet("/Angajati")
public class Angajati extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Angajati() {
    	super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String n= request.getParameter("usr");
		String p= request.getParameter("pwd");
		PrintWriter out= response.getWriter();
		Cookie usr1= new Cookie("u1","ionut");
		Cookie usr2= new Cookie("u2","gabriel");
		Cookie usr3= new Cookie("u3","teodor");
		Cookie usr4= new Cookie("u4","eusebiu");
		Cookie pwd1= new Cookie("p1","ionut123");
		Cookie pwd2= new Cookie("p2","gabriel123");
		Cookie pwd3= new Cookie("p3","teodor123");
		Cookie pwd4= new Cookie("p4","eusebiu123");
		int flag=0;
		String user[]= {usr1.getValue(),usr2.getValue(),usr3.getValue(),usr4.getValue(),};
		String pwd[]= {pwd1.getValue(),pwd2.getValue(),pwd3.getValue(),pwd4.getValue(),};
		for(int i=0;i<4;i++) {
			if(user[i].equals(n)&&pwd[i].equals(p)) {
				flag=1;
			}
		}
		if(flag==1) {
			out.println(" Conectat cu succes. "+" Bun venit: "+n.toUpperCase());
			out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
			out.println(" ID " + " * " + " Nume " + " * " + " Prenume " + " * " + " Data Nasteri " + " * " + " Profesie " + " * " + " Localitate " + " * " + " Filiala " + " * " + " Prefix Telefon " + " * " + " Stare Civila " + " * " + " Data Angajari " + " * " + " Salariu " + " * " + " Bonusuri " + " * " + " Comisioane " + " * " + " Evenimente " + " * " + " Statistica ");
			out.println(" * * * * * ");
			out.println(" 1 " + " * * " + " Popa " + " * * " + " Vasile " + " * * " + " 09.10.1970 " + " * * " + " Tamplar " + " * * "+ " Iasi " + " * * " + " Ploiesti " + " * * * * " + " 0232 " + " * * * * " + " Necasatorit " + " * * " + " 15.05.2001 " + " * * " + " 3000 lei " + " * * " + " 123 lei " + " * * " + " 58 lei " + " * * " + " 89 lei " + " * * * * " + " 3270 lei ");
			out.println(" * * * * * * ");
			out.println(" 2 " + " * * " + " Nedea " + " * * " + " Angela " + " * * " + " 02.06.1930 " + " * * " + " Avocat " + " * * " + " Sibiu " + " * * " + " Brasov " + " * * * * " + " 0269 " + " * * * * " + " Casatorita " + " * * " + " 26.09.2001 " + " * * " + " 5000 lei " + " * * " + " 563 lei " + " * * " + " 788 lei " + " * * " + " 82 lei " + " * * * * " + " 6433 lei ");
			out.println(" * * * * * ");
			out.println(" 3 " + " * * " + " Dumitru " + " * * " + " Alin " + " * * " + " 22.01.1984 " + " * * " + " Inginer " + " * * " + " Brasov " + " * * " + " Bucuresti " + " * * * * " + " 021 " + " * * * * " + " Divortat " + " * * " + " 05.10.2001 " + " * * " + " 3500 lei " + " * * " + " 266 lei " + " * * " + " 86 lei " + " * * " + " 8 lei " + " * * * * " + " 3960 lei ");
			
		}else {
			out.println(" Nu sunteti un utilizator autentificat. ");
			
		}
		
		//doGet(request, response);
	}

}
