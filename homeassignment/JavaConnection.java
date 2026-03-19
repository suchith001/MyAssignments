package week4.homeassignment;

public class JavaConnection extends MySqlConnection {


	@Override
	public void connect() {
		System.out.println("Connect to Database");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnect from  Database");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Execute and update");
		
	}

	public static void main(String[] args) {
		JavaConnection JC=new JavaConnection();
		JC.connect();
		JC.disconnect();
		JC.executeUpdate();
		JC.executeQuery();

	}

	@Override
	public void executeQuery() {
		System.out.println("Execute query from Javaconnection class");
		
	}
}
