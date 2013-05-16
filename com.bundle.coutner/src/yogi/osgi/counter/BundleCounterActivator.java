package yogi.osgi.counter;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleListener;

public class BundleCounterActivator implements BundleActivator,BundleListener {

	private BundleContext context;	
	@Override
	public void bundleChanged(BundleEvent event) {
		// TODO Auto-generated method stub
		
		switch(event.getType())
		{
		case BundleEvent.INSTALLED:
			System.out.println(" Bundle got installed");
			printBundleCount();
			break;
			
		case BundleEvent.UNINSTALLED:
			System.out.println(" Bundle got un installed");
			printBundleCount();
			break;
		
		}
	}

	private void printBundleCount() {
		// TODO Auto-generated method stub
		int count = context.getBundles().length;
		System.out.println( " There are currently " + count + " bundles ");
	}

	@Override
	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		this.context = context;
		context.addBundleListener(this);
		printBundleCount();
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		context.removeBundleListener(this);
	}

}
