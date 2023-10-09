package seminars.fourth.http;


import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class WebServiceTest {

    @Test
    public void SendRequestTest() {
        // Arrange
        HttpClient testHttpClient = mock(HttpClient.class);
        WebService testWebService = new WebService(testHttpClient);
        // Act
        when(testHttpClient.get("https://ya.ru/")).thenReturn("fakeData");
        String result = testWebService.sendRequest("https://ya.ru/");
        //Assert
        verify(testHttpClient).get("https://ya.ru/");
        assertEquals("fakeData", result);
    }
}
