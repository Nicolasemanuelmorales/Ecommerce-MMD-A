package ar.edu.unlam.tallerweb1.dao;

public interface CheckoutDao {
	
	void descontarDelStock(Long id, Integer cantidad);
	
}
