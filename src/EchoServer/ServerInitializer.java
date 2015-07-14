package EchoServer;

import java.io.IOException;
import java.nio.channels.AsynchronousChannelGroup;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerInitializer {
	
	private static int PORT = 5000;
	private static int THREAD_POOL_SIZE = 8;
	private static int INITIAL_SIZE = 4;
	private static int BACK_LOG = 50;
	
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
		
		try {
			AsynchronousChannelGroup group = AsynchronousChannelGroup.withCachedThreadPool(executor, INITIAL_SIZE);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
