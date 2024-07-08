package com.bank.Controller;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.bank.Services.compteService;
import com.bank.Controller.compteController;

public class compteControllerTest {

    private MockMvc mockMvc;

    @Mock
    private compteService compteService;

    @InjectMocks
    private compteController compteController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(compteController).build();
    }

    @Test
    public void testGetCompteBalance() throws Exception {
        int compteId = 1;
        double balance = 100.0;

        when(compteService.getcompteBalance(compteId)).thenReturn(balance);

        mockMvc.perform(get("/compte/" + compteId))
                .andExpect(status().isOk())
                .andExpect(content().string(String.valueOf(balance)));

        verify(compteService, times(1)).getcompteBalance(compteId);
        verifyNoMoreInteractions(compteService);
    }
}
