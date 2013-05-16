package yogi.osgi.tutorial;

import org.osgi.framework.*;

public class HelloWorldActivator implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(" update YOGI you are there ");
		
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(" update YOGI you are not there ");
	}

}
