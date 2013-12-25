package com.aplikasi.warung.repositoryImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.aplikasi.warung.domain.Product;
import com.aplikasi.warung.repository.ProductRepository;

@Service
public class FakeProductRepository implements ProductRepository {

	@Override
	public Product getAllProduct() {
		Product pro = new Product("Akita","Edukasi","Menghitung amal ibadah",50000);
		return pro;
	}
	
	@Override
	public List<Product> getAllpro() {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("Akita","Edukasi","Menghitung amal ibadah",50000));

		products.add(new Product("SAP","Algoritma","MaxFlow",50000));

		products.add(new Product("MaxCa","Algoritma","MaxFlow",50000));
		return products;
	}


}
