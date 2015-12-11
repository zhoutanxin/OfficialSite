package com.enation.eop.sdk.webapp.taglib.html;

import com.enation.eop.sdk.webapp.taglib.ListTaglibSupport;
import com.enation.eop.sdk.webapp.taglib.html.support.GridBodyParam;
import com.enation.eop.sdk.webapp.taglib.html.support.GridBodyProvider;

import javax.servlet.jsp.tagext.Tag;

public class GridBodyTaglib extends ListTaglibSupport{
	private GridBodyProvider gridBodyProvider;
	
	public GridBodyTaglib() {
		gridBodyProvider = new GridBodyProvider();
	}
	
	@Override
    protected void loadProvider() {
		
		Tag tag = this.getParent();
		
		if(tag!=null){
			GridTaglib gridTaglib =(GridTaglib)tag;
			GridBodyParam bodyparm = new GridBodyParam();
			bodyparm.setFrom( gridTaglib.getFrom() );
			this.param =  bodyparm;
			
			this.tagProvider = this.gridBodyProvider;
		} else {
			this.print("body tag must be included in grid tag");
		}
	}
	
	
	@Override
    protected String postStart() {
		return "<tr>";
	}

	
	@Override
    protected String postEnd() {
		return "</tr>";
	}

	
	@Override
    protected String postStartOnce() {
		return "<tbody>";
	}
	
	
	@Override
    protected String postEndOnce() {
		return "</tbody>";
	}
}
