package com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.controller;

import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.model.PlayerTarget;
import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.service.PlayerTargetService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

class PlayerTargetControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private PlayerTargetService playerTargetService;

    @InjectMocks
    private PlayerTargetController playerTargetController;

    @BeforeEach
    void setUp() {
        // Initialize mocks
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(playerTargetController).build();
    }


    @Test
    void testShowCreatePlayerTargetForm() throws Exception {
        // Act & Assert
        mockMvc.perform(get("/player-targets/new"))
                .andExpect(status().isOk())
                .andExpect(view().name("player-target-form"))
                .andExpect(model().attributeExists("playerTarget"));
    }

    @Test
    void testSavePlayerTarget() throws Exception {
        // Arrange
        PlayerTarget playerTarget = new PlayerTarget();
        playerTarget.setPlayerName("Player 1");
        playerTarget.setExpectedDraftRound(1);
        playerTarget.setNotes("Some notes");

        when(playerTargetService.savePlayerTarget(any(PlayerTarget.class))).thenReturn(playerTarget);

        // Act & Assert
        mockMvc.perform(post("/player-targets/save")
                        .param("playerName", "Player 1")
                        .param("expectedDraftRound", "1")
                        .param("notes", "Some notes"))
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("/player-targets"));
    }

    @Test
    void testShowUpdatePlayerTargetForm() throws Exception {
        PlayerTarget playerTarget = new PlayerTarget();
        playerTarget.setId(1L);
        playerTarget.setPlayerName("Player 1");
        playerTarget.setExpectedDraftRound(3);
        playerTarget.setNotes("Some notes");

        when(playerTargetService.getPlayerTargetById(1L)).thenReturn(playerTarget);

        // Act & Assert
        mockMvc.perform(get("/player-targets/edit/{id}", 1L))
                .andExpect(status().isOk())
                .andExpect(view().name("player-target-form"))
                .andExpect(model().attributeExists("playerTarget"))
                .andExpect(model().attribute("playerTarget", playerTarget));
    }

    @Test
    void testUpdatePlayerTarget() throws Exception {
        PlayerTarget playerTarget = new PlayerTarget();
        playerTarget.setId(1L);
        playerTarget.setPlayerName("Player 1");
        playerTarget.setExpectedDraftRound(3);
        playerTarget.setNotes("Some notes");

        when(playerTargetService.savePlayerTarget(any(PlayerTarget.class))).thenReturn(playerTarget);

        // Act & Assert
        mockMvc.perform(post("/player-targets/update/{id}", 1L)
                        .param("playerName", "Player 1")
                        .param("expectedDraftRound", "3")
                        .param("notes", "Some notes"))
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("/player-targets"));
    }

    @Test
    void testDeletePlayerTarget() throws Exception {
        // Act & Assert
        mockMvc.perform(get("/player-targets/delete/{id}", 1L))
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("/player-targets"));

        verify(playerTargetService, times(1)).deletePlayerTarget(1L);
    }
}
