package ir.freeland.springboot.corruptedItem;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

    @Entity
	@Table(name = "Item")
	public class Item {
		
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    @Column
	    private String name;
	    @Column
	    private String price;
	    @Column
	    private String catalog;
	    
	    
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPrice() {
			return price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		public String getCatalog() {
			return catalog;
		}
		public void setCatalog(String catalog) {
			this.catalog = catalog;
		}
		
		
		@Override
		public String toString() {
			return "Item [id=" + id + ", name=" + name + ", price=" + price + ", catalog=" + catalog + "]";
		}
   
}
