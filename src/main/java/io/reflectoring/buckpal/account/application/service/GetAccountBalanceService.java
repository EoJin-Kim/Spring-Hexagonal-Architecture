package io.reflectoring.buckpal.account.application.service;

import java.time.LocalDateTime;

import io.reflectoring.buckpal.account.application.port.in.service.GetAccountBalanceQuery;
import io.reflectoring.buckpal.account.application.port.out.adapter.LoadAccountPort;
import io.reflectoring.buckpal.account.domain.Account.AccountId;
import io.reflectoring.buckpal.account.domain.Money;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class GetAccountBalanceService implements GetAccountBalanceQuery {

	private final LoadAccountPort loadAccountPort;

	@Override
	public Money getAccountBalance(AccountId accountId) {
		return loadAccountPort.loadAccount(accountId, LocalDateTime.now())
				.calculateBalance();
	}
}
