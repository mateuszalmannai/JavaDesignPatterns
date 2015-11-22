package designPatternEssentials.foobarMotorCompany.behavioural.memento.serialisedMemento;

import java.io.*;

/**
 * The SpeedometerMemento class now uses object serialisation
 * for the state saving and restoration
 *
 * The main disadvantage of this approach is that writing to and reading from
 * a disk file is much slower.
 *
 * Note also that while we have been able to make all fields private again, it
 * might still be possible for someone who gained access to the serialized file
 * to use a hex editor to read or change the data.
 */
public class SpeedometerMemento {

  public SpeedometerMemento(Speedometer speedometer) throws IOException {
    // Serialize...
    File speedometerFile = new File("speedometer.ser");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(speedometerFile)));
    objectOutputStream.writeObject(speedometer);
    objectOutputStream.close();
  }

  public Speedometer restoreState() throws IOException, ClassNotFoundException{
    // Deserialize
    File speedometerFile = new File("speedometer.ser");
    ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(speedometerFile)));
    Speedometer speedometer = (Speedometer) objectInputStream.readObject();
    objectInputStream.close();
    return speedometer;
  }
}
