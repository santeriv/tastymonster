package com.tastymonster.patentmojo.automation.element.base;

import com.tastymonster.patentmojo.automation.page.base.AbstractAutomationPage;

public class ButtonWebElement extends AbstractClickableWebElement {

	/**
	 * Buttons are essentially the same as links, but they go about their business in different ways
	 * @param id
	 * @param page
	 */
	public ButtonWebElement( String id, AbstractAutomationPage page ) {
		super( id, page );
	}
}
