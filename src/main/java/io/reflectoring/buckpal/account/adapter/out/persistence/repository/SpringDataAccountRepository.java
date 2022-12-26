package io.reflectoring.buckpal.account.adapter.out.persistence.repository;

import io.reflectoring.buckpal.account.adapter.out.persistence.entity.AccountJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataAccountRepository extends JpaRepository<AccountJpaEntity, Long> {
}
