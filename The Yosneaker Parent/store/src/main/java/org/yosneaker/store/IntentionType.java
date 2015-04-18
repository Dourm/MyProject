package org.yosneaker.store;

public enum IntentionType {
		WANT(0),BUY(1);
		
		private int value;

		private IntentionType(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}
}
