package com.aplikasi.warung.repositoryImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.aplikasi.warung.domain.Product;
import com.aplikasi.warung.repository.ProductRepository;

@Service
public class FakeProductRepository implements ProductRepository {
	
	@Override
	public List<Product> getAllpro() {
		List<Product> products = new ArrayList<Product>();
			products.add(new Product(0,1,"Didika Kata","Didik Ganteng",800,1024, "512 MB","Win Vista","Intel",false));
			products.add(new Product(1,1, "Akita","Menghitung amal ibadah", 50000, 1024, "512 MB", "Windows 7", "1 GHz", false));
			products.add(new Product(2,2, "Tegar","Aplikasi penghitung dosa", 6000, 1024, "512 MB", "Windows 7", "2 GHz", false));
		return products;
	}


}
