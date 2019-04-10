# Streams and IO


[https://gwu-csci2113.github.io/java/6/](https://gwu-csci2113.github.io/java/6/)

### To build and run the code on the seasdb server:

  1. Navigate inside the `src` folder (NOTE: each individual folder in the `src` defines a package).
  2. Example on how to compile and run:
  ```console
  javac voteClient/Voter.java
  java -cp . voteClient/Voter
  ```
  3. To run both a server and a client you need two ssh connections to the server:
  
   - One to run the server
   
  ```console
  ssh -Y netID@seasdb.seas.gwu.edu
  cd path_to_src
  java -cp . netsimple/SimpleServer
  ```
    
   - One to run the client
   
  ```console
  ssh -Y netID@seasdb.seas.gwu.edu
  cd path_to_src
  java -cp . netsimple/SimpleClient
  ```
