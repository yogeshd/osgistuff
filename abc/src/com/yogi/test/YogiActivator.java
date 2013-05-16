package com.yogi.test;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class YogiActivator implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("dada");
		
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("bye");
	}

}
