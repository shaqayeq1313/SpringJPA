package ir.freeland.springboot.corruptedItem;

import jakarta.persistence.*;

@Entity
public class CorruptedItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "item_id", referencedColumnName = "id", unique = true)
    private Item item;
    
    private String reason;
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	
	@Override
	public String toString() {
		return "CorruptedItem [id=" + id + ", item=" + item + ", reason=" + reason + "]";
	}
    
    

}
