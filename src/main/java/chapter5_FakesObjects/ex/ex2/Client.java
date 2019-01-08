package chapter5_FakesObjects.ex.ex2;

public interface Client {
	boolean isNotified(MessageType messageType);
	void receiveMessage(Message message);

	void setSubscribe(MessageType horseRace);
}
