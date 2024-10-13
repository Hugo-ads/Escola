package escola.service;

import escola.model.Aluno;

public interface UserService {

    Aluno findById (Long id);

    Aluno create(Aluno userToCreate);
}
