package J18_최상위클래스.entity;
/*
 * 상품 정보 클래스(Entity Class)
 * 
	 * 변수 ; productCode- int, productName- String, 
	 * 			category-int, productionDate - LocalDate
	 * 
	 * 기본 생성자
	 * 
	 * 전체 생성자
	 * 
	 * getter, setter
	 * 
	 * hashCode() -- 값 비교
	 * 
	 * equals()
	 * 
	 * toString() --출력
 * 
 */

import java.time.LocalDateTime;
import java.util.Objects;

public class Product {  // product 상품에 대한 기본 틀
	// 변수선언
	private int productCode;
	private String productName;
	private int category;
	private LocalDateTime productDate;
	//기본생성자 ctrl + space
	public Product() {
		
		
	}
    // 전체생성자, alt+shift+s 
	public Product(int productCode, String productName, int category, LocalDateTime productDate) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.category = category;
		this.productDate = productDate;
	}
	// getter, setter alt+shift+s
	public int getProductCode() {
		return productCode;
	}

	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public LocalDateTime getProductDate() {
		return productDate;
	}

	public void setProductDate(LocalDateTime productDate) {
		this.productDate = productDate;
	}
	// hashCode + 
	@Override
	public int hashCode() {
		return Objects.hash(category, productCode, productDate, productName);
	}
	// equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return category == other.category && productCode == other.productCode
				&& Objects.equals(productDate, other.productDate) && Objects.equals(productName, other.productName);
	}
	// toString
	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", productName=" + productName + ", category=" + category
				+ ", productDate=" + productDate + "]";
	}
	
	
}

