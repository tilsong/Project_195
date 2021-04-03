package com.mp.p195.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@SequenceGenerator(
        name="Item_SEQ_GEN", sequenceName="Item_SEQ", 
        initialValue=1, allocationSize=1 
)
@Table(name = "item")
public class Item {
	@Id
	@Column(name="item_num")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "ITEM_SEQ_GEN")
	private int mem_num;
	
	@Column (name="itemname") 
	private String itemName;
	
	@Column (name="itemsize") 
	private String itemSize;
	
	@Column (name="itemprice") 
	private int itemPrice;
	
	@Column (name="itemimage") 
	private String itemImage;

	@Column (name="itemcolor") 
	private String itemColor;
	
	@Column (name="itemcategory") 
	private String itemCategory;
	
}
