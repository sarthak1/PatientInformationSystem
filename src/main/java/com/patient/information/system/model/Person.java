package com.patient.information.system.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NonNull
	private String firstName;
	@NonNull
	private String lastName;

}
