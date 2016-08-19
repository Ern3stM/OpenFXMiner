package com.fxminer.open.model;

/**
 * Provides validation tasks for Quote
 * 
 */
public interface QuoteValidator {
	/**
	 * Validate features
	 */
	public boolean isCleanAttribute();

	/**
	 * Validate class variable
	 */
	public boolean isCleanClass();
}
