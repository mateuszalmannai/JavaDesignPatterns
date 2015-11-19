package designPatternEssentials.foobarMotorCompany.behavioural.command;

public class CommandClient {

  public static void main(String[] args) {
    // Create a radio and its up/down command objects
    Radio radio = new Radio();
    radio.on();
    final Command volumeUpCommand = new VolumeUpCommand(radio);
    final Command volumeDownCommand = new VolumeDownCommand(radio);

    // Create an electric window and its up/down command objects
    final ElectricWindow window = new ElectricWindow();
    final WindowUpCommand windowUpCommand = new WindowUpCommand(window);
    final WindowDownCommand windowDownCommand = new WindowDownCommand(window);

    // Create a speech recognition object
    SpeechRecogniser speechRecogniser = new SpeechRecogniser();

    // Control the radio
    speechRecogniser.setCommands(volumeUpCommand, volumeDownCommand);

    System.out.println("Speech recognition controlling the radio");
    speechRecogniser.hearUpSpoken();
    speechRecogniser.hearUpSpoken();
    speechRecogniser.hearUpSpoken();
    speechRecogniser.hearDownSpoken();

    // Control the electric window
    speechRecogniser.setCommands(windowUpCommand, windowDownCommand);
    System.out.println("Speech recognition will now control the window");
    speechRecogniser.hearDownSpoken();
    speechRecogniser.hearUpSpoken();
  }
}
