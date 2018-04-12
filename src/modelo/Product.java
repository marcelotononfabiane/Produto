/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Marcelo
 */
public class Product {
private String name;
	private Integer amount;
	private Float value;
	private Float valueTotal;
	
	public Product (String name, int amount, float value) {
		this.name = name;
		this.amount = amount;
		this.value = value;
		this.valueTotal = value * amount;
	}
	
@Override
	public String toString() {
		return "Name: " + name + "; amount.: " + amount + "; Price: "
				+ value + "; Value Total: " + valueTotal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
		this.valueTotal = amount*value;
	}
	public Float getValue() {
		return value*amount;
	}
	public void setValue(Float value) {
		this.value = value;
		this.valueTotal = amount*value;
	}
	public Float getValueTotal() {
		return valueTotal;
	}	
}