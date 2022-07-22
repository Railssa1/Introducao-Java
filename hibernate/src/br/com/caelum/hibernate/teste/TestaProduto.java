package br.com.caelum.hibernate.teste;

import java.util.Calendar;

import org.hibernate.Session;

import br.com.caelum.hibernate.HibernateUtil;
import br.com.caelum.hibernate.Produto;
import br.com.caelum.hibernate.dao.ProdutoDAO;

public class TestaProduto {

	public static void main(String[] args) {
		Session session = new HibernateUtil().getSession();
		ProdutoDAO dao = new ProdutoDAO(session);
		
		Produto produto = new Produto();
		produto.setNome("Teclado Gamer");
		
		Calendar data = Calendar.getInstance();
		data.set(Calendar.DATE, 31);
		data.set(Calendar.MONTH, Calendar.MAY);
		data.set(Calendar.YEAR, 2022);
		
		produto.setDataInicio(data);
		produto.setPreco(176.90);
		
		session.beginTransaction();
		dao.salva(produto);
		session.getTransaction().commit();
		session.close();
	}

}
