package org.sarvam.accordionsections.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.smartgwt.client.widgets.layout.HLayout;
import com.smartgwt.client.widgets.layout.SectionStack;

public class AccordionAndSections implements EntryPoint {
	
	// ************* Hi vasanth *******
	
	public void onModuleLoad() {
		
		HLayout sectionShowHide = new SectionsShowHideSample().getSectionShowHide();
		RootPanel.get("mainMenu").add(sectionShowHide);
		
		HLayout sectionResize = new SectionsResizeSample().getSectionResize();
		sectionResize.setTop(50);
		RootPanel.get("mainMenu").add(sectionResize);
		
		HLayout expandCollapse = new ExpandCollapseSample().getExpandCollapse();
		expandCollapse.setTop(150);
		RootPanel.get("mainMenu").add(expandCollapse);
		
		SectionStack sectionReorder = new SectionsReorderSample().getSectionReorder();
		sectionReorder.setTop(250);
		RootPanel.get("mainMenu").add(sectionReorder);
		
		SectionStack sectionCustomControls = new SectionsCustomControlsSample().getSectionCustomControls();
		sectionCustomControls.setTop(350);
		RootPanel.get("mainMenu").add(sectionCustomControls);
		
		HLayout sectionAddRemove = new SectionsAddRemoveSample().getSectionAddRemove();
		sectionAddRemove.setTop(450);
		RootPanel.get("mainMenu").add(sectionAddRemove);
	}
}
