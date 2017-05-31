package br.com.fuji.mvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="produto_id")
	private int produtoId;
	
	@Column(name="part_number")
	private String partNumber;
	
	@Column(name="part_name")
	private String partName;
	
	@Column(name="rating")
	private String rating;
	
	@Column(name="price")
	private String price;
	
	@Column(name="part_name_trad")
	private String partNameTrad;
	
	@Column(name="ncm")
	private String ncm;
	
	@Column(name="anotacoes")
	private String anotacoes;
	
	public Produto(){
		
	}

	public int getProdutoId() {
		return produtoId;
	}

	public void setProdutoId(int produtoId) {
		this.produtoId = produtoId;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public String getPartNameTrad() {
		return partNameTrad;
	}

	public void setPartNameTrad(String partNameTrad) {
		this.partNameTrad = partNameTrad;
	}

	public String getNcm() {
		return ncm;
	}

	public void setNcm(String ncm) {
		this.ncm = ncm;
	}

	public String getAnotacoes() {
		return anotacoes;
	}

	public void setAnotacoes(String anotacoes) {
		this.anotacoes = anotacoes;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Produto [produtoId=" + produtoId + ", partNumber=" + partNumber + ", partName=" + partName + ", rating="
				+ rating + ", price=" + price + ", partNameTrad=" + partNameTrad + ", ncm=" + ncm + ", anotacoes="
				+ anotacoes + "]";
	}
	
}
