package voteClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Voter {

	public static void main(String[] args) {

		String host = "127.0.0.1"; //replace this with the IP provided during lecture
		int portnum = 5555;
		
		Socket s;
		try {

			// create socket, input and output streams

			// send the vote

			// Make sure messages are sent

			// receive and print confirmation

			// clean up
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
