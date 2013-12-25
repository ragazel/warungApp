package com.aplikasi.warung.domain;

public class Product {
	private String judulApp;
	private String kategori;
	private String keterangan;
	private int harga;
	public Product(String judul,String kategori,String keterangan,int harga)
	{
		this.judulApp = judul;
		this.kategori = kategori;
		this.keterangan = keterangan;
		this.harga = harga;
	}
	
	public String getJudulApp() {
		return judulApp;
	}
	public void setJudulApp(String judulApp) {
		this.judulApp = judulApp;
	}
	public String getKategori() {
		return kategori;
	}
	public void setKategori(String kategori) {
		this.kategori = kategori;
	}
	public String getKeterangan() {
		return keterangan;
	}
	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}
	public int getHarga() {
		return harga;
	}
	public void setHarga(int harga) {
		this.harga = harga;
	}
}
