package com.cognizant;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class AppTest {

    @Test
    public void testFetchData() {

        ExternalApi mockApi = mock(ExternalApi.class);

        when(mockApi.getData()).thenReturn("Mockito Working");

        MyService service = new MyService(mockApi);

        String result = service.fetchData();

        assertEquals("Mockito Working", result);

        verify(mockApi).getData();
    }
}