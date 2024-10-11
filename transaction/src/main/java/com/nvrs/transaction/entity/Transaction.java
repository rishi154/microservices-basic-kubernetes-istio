package com.nvrs.transaction.entity;

import java.time.Instant;
import java.util.Date;
import java.util.List;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Customer
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {

	private Long tran_id = null;
	private Long merchantId = null;
	private List<TranProduct> products = null;
    private Long customerId = null;
	private long amount;
	private Date dateCreated = Date.from(Instant.now());
	private Date dateModified = Date.from(Instant.now());
	private String status = null;

	
	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

	@Override
	public String toString() {
		return "Transaction [id=" + tran_id + ", merchantId=" + merchantId + ", products=" + products + ", customerId="
				+ customerId + ", amount=" + amount + ", dateCreated=" + dateCreated + ", dateModified=" + dateModified
				+ ", status=" + status + ", getProducts()=" + getProducts() + ", getCustomerId()=" + getCustomerId()
				+ ", getAmount()=" + getAmount() + ", getMerchantId()=" + getMerchantId() + ", getId()=" + getTran_id()
				+ ", getDateModified()=" + getDateModified() + ", getDateCreated()=" + getDateCreated()
				+ ", getStatus()=" + getStatus() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
