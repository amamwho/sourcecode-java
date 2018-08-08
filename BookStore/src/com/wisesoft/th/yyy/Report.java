package com.wisesoft.th.yyy;

abstract public class Report {

	abstract void createHeader();
	abstract void createBody();
	abstract void createFooter();
	void generateReport() {
		createHeader();
		createBody();
		createFooter();
	}
}

class Report1 extends Report {

	@Override
	void createHeader() {
	}

	@Override
	void createBody() {
	}

	@Override
	void createFooter() {
	}
	
}