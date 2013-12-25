package com.aplikasi.warung.domain;

public class Member {
	
	private String nama;
	private String telepon;
	private String alamat;
	private String kodePos;
	private String email;
	private String password;
	
	public Member(){
		
	}
	public Member(String nama,String telepon,String alamat,String kodepos,String email,String password){
		this.setNama(nama);
		this.setTelepon(telepon);
		this.setAlamat(alamat);
		this.setKodePos(kodepos);
		this.setEmail(email);
		this.setPassword(password);
	}
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getTelepon() {
		return telepon;
	}
	public void setTelepon(String telepon) {
		this.telepon = telepon;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public String getKodePos() {
		return kodePos;
	}
	public void setKodePos(String kodePos) {
		this.kodePos = kodePos;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
