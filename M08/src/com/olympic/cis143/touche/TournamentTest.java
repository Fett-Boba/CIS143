package com.olympic.cis143.touche;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TournamentTest {

	@Test
	void testToString() {
		Tournament t = new Tournament();
		t.setTournamentName("Orion Invitational");
		t.setNumFencers(7);
		assertEquals("NAME: Orion Invitational NUM FENCERS: 7", t.toString());
	}
}
