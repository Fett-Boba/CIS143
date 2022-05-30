package com.boba.practiceproblems;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class NeverGonna2Test {

	@Test
    public void exampleTests() {
        List<String> expected = new ArrayList<>() {
          {
            add("Never gonna give you up");
            add("NEVER GONNA let you down");
            add("Never gonna run around and desert you");
            add("NEVER GONNA make you cry");
            add("Never gonna say goodbye");
            add("NEVER GONNA tell a lie and hurt you");
          }   
        };
      
        assertEquals(expected, NeverGonna2.music(new ArrayList<Integer>(){
            {
                add(0);
                add(1);
                add(2);
                add(3);
                add(4);
                add(5);
            }
        }));
        
        expected.clear();
        expected.add("Never gonna say goodbye");
        expected.add("NEVER GONNA say goodbye");
        expected.add("Never gonna make you cry");
        expected.add("NEVER GONNA tell a lie and hurt you");
        
        assertEquals(expected, NeverGonna2.music(new ArrayList<Integer>(){
            {
                add(4);
                add(4);
                add(3);
                add(5);
            }
        }));
      
        expected.clear();
        expected.add("Never gonna let you down");
        expected.add("NEVER GONNA make you cry");
        expected.add("Never gonna run around and desert you");
        expected.add("NEVER GONNA say goodbye");
        expected.add("Never gonna let you down");
      
        assertEquals(expected, NeverGonna2.music(new ArrayList<Integer>(){
            {
                add(1);
                add(3);
                add(2);
                add(4);
                add(1);
            }
        }));
    }

	
	
	
	
}
