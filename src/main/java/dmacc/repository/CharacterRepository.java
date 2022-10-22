/*
 * @author Noah Clark
 * CIS175 Fall 2022
 * Oct 22, 2022
 */

package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Character;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Long> {

}
