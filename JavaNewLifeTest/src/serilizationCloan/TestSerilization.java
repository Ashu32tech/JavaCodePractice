package serilizationCloan;


import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Nagesh Chauhan
 */
class Human implements Serializable {

 private static final long serialVersionUID = 1L;

  String gender;
 String color;

/* Human(String gender, String color) {
  this.gender = gender;
  this.color = color;
 }*/

 public String getGender() {
  return gender;
 }

 public void setGender(String gender) {
  this.gender = gender;
 }

 public String getColor() {
  return color;
 }

 public void setColor(String color) {
  this.color = color;
 }

}

/**
 * @author Nagesh Chauhan
 */
class Man extends Human {

 private String name;
 private String address;
/*
 Man(String gender, String color, String name, String address) {
  super(gender, color);
  this.name = name;
  this.address = address;
 }*/

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getAddress() {
  return address;
 }

 public void setAddress(String address) {
  this.address = address;
 }

}


/**
 * @author Nagesh Chauhan
 */
public class TestSerilization {
 public static void main(String args[]) {

  /*
   * Assigning values to Man class's instance
   */
  //Man man = new Man("Male", "Black", "Anderw", "Delhi");
	Man man=new Man();
	man.setName("Anderw");
	man.setAddress("Delhi");
	man.setColor("Black");
	man.setGender("Male");
  /*
   * Serializing Man's instance
   */
  try {
   FileOutputStream fileOutputStream = new FileOutputStream(
     "serialObject.ser");
   ObjectOutputStream objectOutputStream = new ObjectOutputStream(
     fileOutputStream);
   objectOutputStream.writeObject(man);

  } catch (FileNotFoundException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  } catch (IOException ioe) {
   // TODO Auto-generated catch block
   ioe.printStackTrace();
  }

  /*
   * Deserializing Man's instance
   */
  Man manout = null;

  try {
   FileInputStream fileInputStream = new FileInputStream(
     "serialobject.ser");
   ObjectInputStream inputStream = new ObjectInputStream(
     fileInputStream);
   manout = (Man) inputStream.readObject();

  } catch (FileNotFoundException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  } catch (IOException ioe) {
   // TODO Auto-generated catch block
   ioe.printStackTrace();
  } catch (ClassNotFoundException cnf) {
   // TODO Auto-generated catch block
   cnf.printStackTrace();
  }

  /*
   * Printing values from deserialized Man's object
   */
  System.out.println("Printing value of Deserailized Man's instance :");
  System.out.println("Gender: " + manout.getGender());
  System.out.println("Color: " + manout.getColor());
  System.out.println("Name: " + manout.getName());
  System.out.println("Address: " + manout.getAddress());

 }

}
