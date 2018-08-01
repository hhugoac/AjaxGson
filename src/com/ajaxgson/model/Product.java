package com.ajaxgson.model;

public class Product{
	private int IdProduct;
	private String ProductName;
	private double ProductPrice;
	
	//Get and set methods
	public void setIdProduct(int IdProduct)
	{
		this.IdProduct=IdProduct;
	}
	public int getIdProduct()
	{
		return IdProduct;
	}
	public void setProductName(String ProductName)
	{
		this.ProductName=ProductName;
	}
	public String getProductName()
	{
		return ProductName;
	}
	public void setProductPrice(double ProductPrice)
	{
		this.ProductPrice=ProductPrice;
	}
	public double getProductPrice()
	{
		return ProductPrice;
	}
	
	//Constructor Methods
	
	public Product()
	{
		setIdProduct(0);
		setProductName("");
		setProductPrice(0.0);
	}
	public Product(int IdProduct,String ProductName,double ProductPrice)
	{
		setIdProduct(IdProduct);
		setProductName(ProductName);
		setProductPrice(ProductPrice);
	}
}
