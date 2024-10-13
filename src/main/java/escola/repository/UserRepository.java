package escola.repository;

import escola.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Aluno, Long> {
}
