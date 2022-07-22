package br.com.caelum.hibernate;

import java.util.Calendar;

import org.hibernate.Session;

public class AdicionaProduto {

	public static void main(String[] args) {
		//Instanciando novo produto
		
		Produto produto1 = new Produto();
		produto1.setNome("Fone gamer");
		
		Calendar data = Calendar.getInstance();
		data.set(Calendar.DATE, 31);
		data.set(Calendar.MONTH, Calendar.MAY);
		data.set(Calendar.YEAR, 2022);
		
		produto1.setDataInicio(data);
		produto1.setPreco(95.90);
		
		//Criando uma sessao
		Session session = new HibernateUtil().getSession();
		session.beginTransaction();
		
		//Salvando
		session.save(produto1);
		
		session.getTransaction().commit();
		System.out.println("ID do produto: " + produto1.getId());
		session.close();
		
		
		
	}

}
