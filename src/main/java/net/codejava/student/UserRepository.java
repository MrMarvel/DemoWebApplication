package net.codejava.student;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Student, Long> {
    @Override
    <S extends Student> S save(S s);

    @Override
    Iterable<Student> findAll();

    @Override
    Iterable<Student> findAllById(Iterable<Long> iterable);

    @Override
    void deleteById(Long aLong);
}