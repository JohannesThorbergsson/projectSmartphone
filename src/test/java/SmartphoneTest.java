import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneTest {
    Smartphone testPhone = new Smartphone("8Pro",
            "OnePlus",
            new ArrayList<Contact>(List.of(new Friend("Tom", 1125252), new Friend("Roh", 52585))));
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
}
