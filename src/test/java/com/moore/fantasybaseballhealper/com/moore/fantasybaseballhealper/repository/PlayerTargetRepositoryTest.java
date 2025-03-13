package com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.repository;

import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.model.PlayerTarget;
import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.service.PlayerTargetService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.Arrays;
import java.util.Optional;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class PlayerTargetRepositoryTest {

    @Mock
    private PlayerTargetRepository playerTargetRepository;

    @InjectMocks
    private PlayerTargetService playerTargetService;

    private PlayerTarget playerTarget;

    @BeforeEach
    void setUp() {
        playerTarget = new PlayerTarget();
        playerTarget.setId(1L);
        playerTarget.setPlayerName("Player 1");
        playerTarget.setExpectedDraftRound(1);
        playerTarget.setNotes("Notes for Player 1");
    }

    // Test findAll()
    @Test
    void testFindAllPlayerTargets() {
        List<PlayerTarget> playerTargets = Arrays.asList(playerTarget);


        when(playerTargetRepository.findAll()).thenReturn(playerTargets);

        List<PlayerTarget> result = playerTargetRepository.findAll();

        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("Player 1", result.get(0).getPlayerName());
        verify(playerTargetRepository, times(1)).findAll();
    }

    // Test save()
    @Test
    void testSavePlayerTarget() {
        when(playerTargetRepository.save(playerTarget)).thenReturn(playerTarget);

        PlayerTarget savedPlayerTarget = playerTargetRepository.save(playerTarget);

        assertNotNull(savedPlayerTarget);
        assertEquals("Player 1", savedPlayerTarget.getPlayerName());
        verify(playerTargetRepository, times(1)).save(playerTarget);
    }

    // Test findById()
    @Test
    void testFindPlayerTargetById() {
        when(playerTargetRepository.findById(1L)).thenReturn(Optional.of(playerTarget));

        Optional<PlayerTarget> result = playerTargetRepository.findById(1L);

        assertTrue(result.isPresent());
        assertEquals("Player 1", result.get().getPlayerName());
        verify(playerTargetRepository, times(1)).findById(1L);
    }

    // Test deleteById()
    @Test
    void testDeletePlayerTarget() {
        doNothing().when(playerTargetRepository).deleteById(1L);

        playerTargetRepository.deleteById(1L);

        verify(playerTargetRepository, times(1)).deleteById(1L);
    }
}