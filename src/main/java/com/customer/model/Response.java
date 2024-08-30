package com.customer.model;

import java.util.List;

import com.customer.entity.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response {

	
	private List<Policy> policies;
}
