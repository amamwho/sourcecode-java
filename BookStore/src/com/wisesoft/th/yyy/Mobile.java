package com.wisesoft.th.yyy;

interface Mobile {
	void call();
	void playMusic();
}

interface Mobile2018 {
	void takePhoro();
}

class IPhone implements Mobile, Mobile2018 {

	@Override
	public void takePhoro() {
	}

	@Override
	public void call() {
	}

	@Override
	public void playMusic() {
	}
	
}

class Sumsung implements Mobile {

	@Override
	public void call() {
	}

	@Override
	public void playMusic() {
	}
	
}

abstract class Dad {
	abstract void call();
}

abstract class Mom {
	abstract void speak();
}

class Child extends Dad {

	@Override
	void call() {
	}
}
