package com.nvrs.merchant.entity;

import java.time.Instant;
import java.util.Date;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Merchant
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Merchant {
	private Long id = null;
	private String name = null;
	private String address = null;
	private String phone = null;
	private Date dateCreated = Date.from(Instant.now());
	private Date dateModified = Date.from(Instant.now());
	private String status = null;

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Merchant merchant = (Merchant) o;
		return Objects.equals(this.id, merchant.id) && Objects.equals(this.name, merchant.name)
				&& Objects.equals(this.address, merchant.address) && Objects.equals(this.phone, merchant.phone)
				&& Objects.equals(this.dateCreated, merchant.dateCreated)
				&& Objects.equals(this.dateModified, merchant.dateModified)
				&& Objects.equals(this.status, merchant.status);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, address, phone, dateCreated, dateModified, status);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Merchant {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    address: ").append(toIndentedString(address)).append("\n");
		sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
		sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
		sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("}");
		return sb.toString();
	}

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
}
