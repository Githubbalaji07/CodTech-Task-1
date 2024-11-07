package com.balajichavan.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balajichavan.portfolio.model.FormData;
import com.balajichavan.portfolio.repository.FormDataRepository;

@Service
public class FormDataService {
	
	
	@Autowired
	private FormDataRepository repo;
	
	public FormData saveForm(FormData form)
	{
		return repo.save(form);
	}
}
