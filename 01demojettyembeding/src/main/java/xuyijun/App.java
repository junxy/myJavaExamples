package xuyijun;

import org.eclipse.jetty.server.Server;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {
        System.out.println( "Hello World!" );

        System.out.println(" start server...");
        Server server = new Server(8080);

        server.setHandler(new HelloHandler());

        server.start();
        server.join();

    }
}
