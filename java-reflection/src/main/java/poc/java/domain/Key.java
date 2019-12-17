package poc.java.domain;

import java.io.Serializable;

public class Key implements Serializable {
	private static final long serialVersionUID = 730848941453491548L;
	private long otdLocalSequenceNo;
	private short groupId;

	public Key() {
		super();
	}

	public Key(long otdLocalSequenceNo, short groupId) {
		super();
		this.otdLocalSequenceNo = otdLocalSequenceNo;
		this.groupId = groupId;
	}

	public short getGroupId() {
		return groupId;
	}

	public void setGroupId(short groupId) {
		this.groupId = groupId;
	}

	public long getOtdLocalSequenceNo() {
		return otdLocalSequenceNo;
	}

	public void setOtdLocalSequenceNo(long otdLocalSequenceNo) {
		this.otdLocalSequenceNo = otdLocalSequenceNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + groupId;
		result = prime * result + (int) (otdLocalSequenceNo ^ (otdLocalSequenceNo >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		if (groupId != other.groupId)
			return false;
		if (otdLocalSequenceNo != other.otdLocalSequenceNo)
			return false;
		return true;
	}

}
