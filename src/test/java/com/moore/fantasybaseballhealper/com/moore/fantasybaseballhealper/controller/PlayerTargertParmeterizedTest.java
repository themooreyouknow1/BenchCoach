package com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.controller;

import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.model.PlayerTarget;
import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.service.PlayerTargetService;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PlayerTargetParameterizedTest {

    private MockMvc mockMvc;

    @Mock
    private PlayerTargetService playerTargetService;

    @InjectMocks
    private PlayerTargetController playerTargetController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(playerTargetController).build();
    }

    // Parameterized test for saving player targets with different inputs
    @ParameterizedTest
    @CsvSource({
            "Player 1, 1, Some notes",
            "Player 2, 3, Another note",
            "Player 3, 5, Notes for Player 3"
    })
    void testSavePlayerTargetWithDifferentInputs(String playerName, int expectedDraftRound, String notes) throws Exception {
        // Arrange: Create a PlayerTarget object with the parameters
        PlayerTarget playerTarget = new PlayerTarget();
        playerTarget.setPlayerName(playerName);
        playerTarget.setExpectedDraftRound(expectedDraftRound);
        playerTarget.setNotes(notes);

        // Mock the service call
        when(playerTargetService.savePlayerTarget(any(PlayerTarget.class))).thenReturn(playerTarget);

        // Act & Assert: Perform the POST request and check for correct behavior
        mockMvc.perform(MockMvcRequestBuilders.post("/player-targets/save")
                        .param("playerName", playerName)
                        .param("expectedDraftRound", String.valueOf(expectedDraftRound))
                        .param("notes", notes))
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("/player-targets"));

        // Verify that savePlayerTarget was called with the correct PlayerTarget
        verify(playerTargetService, times(1)).savePlayerTarget(any(PlayerTarget.class));
    }
}
