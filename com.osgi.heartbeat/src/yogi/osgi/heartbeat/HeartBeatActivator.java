package yogi.osgi.heartbeat;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class HeartBeatActivator implements BundleActivator {
	
	private Thread thread;
	
	@Override
	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		thread = new Thread(new HeartBeat());
		thread.start();
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		thread.interrupt();
	}
	
	private class HeartBeat implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			try{
				while(!Thread.currentThread().isInterrupted()){
					Thread.sleep(3000);
					System.out.println(" I am still here ");
				}
				
			}catch(InterruptedException ie){
				System.out.println("I am going down now ");
			}
		}
		
	}

}
