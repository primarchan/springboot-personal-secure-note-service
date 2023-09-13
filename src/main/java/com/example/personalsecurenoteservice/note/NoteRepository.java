package com.example.personalsecurenoteservice.note;

import com.example.personalsecurenoteservice.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Long> {

    List<Note> findByUserOrderByIdDesc(User user);

    Note findByIdAndUser(Long id, User user);
}
