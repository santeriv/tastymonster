package com.tastymonster.patentmojo.automation.element.base;

import com.tastymonster.patentmojo.automation.page.base.AbstractAutomationPage;

/**
 * All Settable elements will share these characteristics, enforced by the T type.
 * Many of these have not yet been implemented
 * @author mmerrell
 *
 * @param <T>
 */
public abstract class AbstractSettableWebElement<T> extends AbstractWebElement implements ISettable<T> {

	private T value;
	
	public AbstractSettableWebElement( String id, AbstractAutomationPage page ) {
		this( id, null, page );
	}
	
	public AbstractSettableWebElement(String id, TabWebElement tab, AbstractAutomationPage page ) {
		super( id, tab, page );
	}

	@Override
	public void setValue( T value ) {
		this.value = value;
	}
	
	@Override
	public void setWebValue() {
	}
	
	public T getWebValue() {
		return value;
	}

	@Override
	public boolean hasValue() {
		return value != null;
	}

	@Override
	public boolean exists() {
		return false;
	}
	
	public T getValue() {
		return value;
	}

}
