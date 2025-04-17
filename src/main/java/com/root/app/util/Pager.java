package com.root.app.util;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Pager {
	
	private Long startNum;
	private Long perPage;
	private Long page;
	
	public Long getStartNum() {
		this.startNum = (this.getPage()-1)*this.getPerPage();
		return startNum;
	}

	public Long getPerPage() {
		if(this.perPage == null) {
			this.perPage = 10L;
		}
		return perPage;
	}


	public Long getPage() {
		if(this.page == null || this.page < 1) {
			this.page = 1L;
		}
		return page;
	}

}
