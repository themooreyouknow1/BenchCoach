//package com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.service;
//
//import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.model.Pitcher;
//import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.repository.PitcherRepository;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.ActiveProfiles;
//
//import java.util.Optional;
//
//import static org.mockito.Mockito.*;
//import static org.junit.jupiter.api.Assertions.*;
//
//@ActiveProfiles("test")
//@SpringBootTest
//public class PitcherServiceTest {
//
//    @Mock
//    private PitcherRepository pitcherRepository;
//
//    @InjectMocks
//    private PitcherService pitcherService;
//
//    private Pitcher pitcher;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.openMocks(this);
//        pitcher = new Pitcher();
//        pitcher.setPitcherId(21);
//        pitcher.setPlayer("Jackie Robinson");
//    }
//
//    @Test
//    void getPitcherById_ValidId_ReturnsPitcher() {
//        // Arrange
//        when(pitcherRepository.findById(8)).thenReturn(Optional.of(pitcher));
//
//        // Act
//        Optional<Pitcher> result = pitcherService.getPitcherById(1L);
//
//        // Assert
//        assertTrue(result.isPresent());
//        assertEquals(pitcher.getPlayer(), result.get().getPlayer()); // Compare the player name
//        verify(pitcherRepository, times(1)).findById(1L); // Verify that findById was called once
//    }
//}
