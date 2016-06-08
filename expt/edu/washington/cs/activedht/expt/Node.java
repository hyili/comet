package edu.washington.cs.activedht.expt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.logging.Level;

import edu.washington.cs.activedht.db.DHTDBValueFactory;

public class Node {
	public static void main(String[] args) throws Exception {
		int startupTime = 5000;
		int numObjects = 1;
		int localPort = 1234;
		String localHostname = "localhost";
		String bootstrapLoc = "localhost:4321";
		DHTDBValueFactory valueFactory = ActivePeer.KAHLUA_VALUE_FACTORY_INTERFACE;
		PrintStream out = System.out;
		InputStream in = System.in;

		for (int i = 0; i < args.length; ++i) {
			if (args[i].equals("-o")) {
				out = new PrintStream(new FileOutputStream(args[++i], true));
			} else if (args[i].equals("-n")) {
				numObjects = Integer.parseInt(args[++i]);
			} else if (args[i].equals("-v")) {
				valueFactory = ActivePeer.ValueFactory.valueOf(args[++i]).fi;
			} else if (args[i].equals("-w")) {
				startupTime = Integer.parseInt(args[++i]);
			} else if (args[i].equals("-p")) {
				localPort = Integer.parseInt(args[++i]);
			} else if (args[i].equals("-h")) {
				localHostname = args[++i];
			} else if (args[i].equals("-b")){ // bootstrap host:port
				bootstrapLoc = args[++i];
			} else if (args[i].equals("-f")) {
				in = new FileInputStream(args[++i]);
			}
		}
		ActivePeer peer = new ActivePeer(localPort, bootstrapLoc, Level.OFF,
				valueFactory, 200);
		peer.init(localHostname);
		
		in.read();
	}
}