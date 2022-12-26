package io.reflectoring.buckpal.account.application.port.out.service;

import io.reflectoring.buckpal.account.domain.Account;

public interface AccountLock {

	void lockAccount(Account.AccountId accountId);

	void releaseAccount(Account.AccountId accountId);

}
