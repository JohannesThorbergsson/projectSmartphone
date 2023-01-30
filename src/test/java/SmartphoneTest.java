import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneTest {
    Smartphone testPhone = new Smartphone("8Pro",
            "OnePlus",
            new ArrayList<>(List.of(new Friend("Tom", 1125252), new Friend("Roh", 52585))));
    @Test
    void testStartRadio() {
        Assertions.assertTrue(testPhone.startRadio());
    }
    @Test
    void testStopRadio() {
        Assertions.assertFalse(testPhone.stopRadio());
    }
    @Test
    void testGetPosition(){
        Assertions.assertEquals("Heidelberg", testPhone.getPostion());
    }
    @Test
    void testToString(){
        Assertions.assertEquals("Smartphone{" +
                "modelName='" + "8Pro" + '\'' +
                ", manufacturer='" + "OnePlus" + '\'' +
                ", contactList=" + "[Friend{name=Tom phoneNumber=1125252}, Friend{name=Roh phoneNumber=52585}]}", testPhone.toString());
    }
    @Test
    void testAddContact() {
        //GIVEN
        List<Contact> expandedTestList = new ArrayList<>(List.of(
                new Friend("Tom", 1125252),
                new Friend("Roh", 52585),
                new BusinessContact("Daniel", "neuefische")));
        BusinessContact testAddedContact = new BusinessContact("Daniel", "neuefische");
        //WHEN
        testPhone.addContact(testAddedContact);
        //THEN
        Assertions.assertEquals(expandedTestList.toString(), testPhone.getContactList().toString());
    }
    @Test
    void testGetContact() {
        //GIVEN
        Contact contactToRetrieve = new Friend("Roh", 52585);
        //WHEN
        Contact retrievedContact = testPhone.getContact(1);
        //THEN
        Assertions.assertEquals(contactToRetrieve.toString(), retrievedContact.toString());
    }
    @Test
    void testGetContactByName(){
        //GIVEN
        Contact contactToRetrieve = new Friend("Roh", 52585);
        //WHEN
        Contact retrievedContact = testPhone.getContactByName("Roh");
        //THEN
        Assertions.assertEquals(contactToRetrieve.toString(), retrievedContact.toString());
    }
    @Test
    void testRemoveContactByName(){
        //GIVEN
        List<Contact> testListOneElementRemoved = new ArrayList<>(List.of(new Friend("Roh", 52585)));
        //WHEN
        List<Contact> removedOneEntryTestList = testPhone.removeContactByName("Tom");
        //THEN
        Assertions.assertEquals(testListOneElementRemoved.toString(), removedOneEntryTestList.toString());
    }
}
