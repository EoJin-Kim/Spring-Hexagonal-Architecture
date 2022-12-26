package io.reflectoring.buckpal.account.application.port.in.adapter;

import io.reflectoring.buckpal.account.application.port.in.model.SendMoneyCommand;

public interface SendMoneyUseCase {

	boolean sendMoney(SendMoneyCommand command);

}
