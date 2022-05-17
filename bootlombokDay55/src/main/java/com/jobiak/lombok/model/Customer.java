package com.jobiak.lombok.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude= {"custId"})
@EqualsAndHashCode
//@ReqArgsConstructor
@Data
public class Customer 
{
		@Setter
		@Getter
		private long custId;
		@Setter
		@Getter
		private String name;
		@Setter
		@Getter
		private double balance;
}
