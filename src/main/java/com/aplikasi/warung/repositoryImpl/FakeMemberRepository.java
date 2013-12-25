package com.aplikasi.warung.repositoryImpl;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.aplikasi.warung.domain.Member;
import com.aplikasi.warung.repository.MemberRepository;

@Service
public class FakeMemberRepository implements MemberRepository {

	private List<Member> members = new ArrayList<Member>();
	
	public FakeMemberRepository(){
		members.add(new Member("Admin","123456789","Jl. QWERTY no.12", "10311","warsi@gmail.com","warsiCoy"));
	}
	@Override
	public List<Member> getMemberAll() {

		return members;
	}

	@Override
	public void addMember(Member Member) {
		this.members.add(Member);
	}

}
