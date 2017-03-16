/**
 * COMMENTING DONE
 */
package org.avinash.demo.MessangerDemo.dao;

/**
 * @author Avinash
 *
 */
public enum CheckStatus {
		ONE(1),
	   TWO(2);
	   private int value;
	   private CheckStatus(int value) {
	      this.value = value;
	   }
	   public int getValue() {
	      return value;
	   }
	   }
