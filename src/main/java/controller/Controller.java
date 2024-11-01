// Controller - servlet, recebe requisições do user

package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DAO;
import model.JavaBeans;

/* Servlet implementation class Controller */

// requisicoes recebidas
@WebServlet(urlPatterns = { "/Controller", "/main", "/insert" })
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO dao = new DAO();
	JavaBeans contato = new JavaBeans();

	public Controller() {
		super();
		// TODO Auto-generated constructor stub

	}

	// method get
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String action = request.getServletPath();
		System.out.println(action);

		if (action.equals("/main")) {
			contatos(request, response);
		} else if (action.equals("/insert")) {
			novoContato(request, response);
		} else {
			response.sendRedirect("index.html");
		}
		// teste de conexao
		// dao.testeConexao();
	}

	// listar contatos
	protected void contatos(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//Criando objeto que receberá os dados javaBeans
		ArrayList<JavaBeans> lista = dao.listarContatos();
		
		
		
		//TESTE RECEBIMANETO DA LISTA
		/*for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).getIdcon());
			System.out.println(lista.get(i).getNome());
			System.out.println(lista.get(i).getFone());
			System.out.println(lista.get(i).getEmail());
		}*/
	}
	
	// novo contato
		protected void novoContato(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			//teste para recebimeto do contato
			/*System.out.println(request.getParameter("nome"));
			System.out.println(request.getParameter("fone"));
			System.out.println(request.getParameter("email"));*/
			
			//setar variaveis JavaBeans
			contato.setNome(request.getParameter("nome"));
			contato.setFone(request.getParameter("fone"));
			contato.setEmail(request.getParameter("email"));
			
			//invocar metodo inserirContato passando o objeto contato
			dao.insertContato(contato);
			
			//redirecionar para agenda.jsp
			response.sendRedirect("main");
;		}
}



