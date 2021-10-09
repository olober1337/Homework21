package homework21.services;

import homework21.dao.AccountDao;
import homework21.dto.AccountDto;
import homework21.entity.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountService {

    private final AccountDao accountDao;

    public AccountService(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public List<AccountDto> findAllAccounts() {

        List<Account> accounts = accountDao.findAllAccounts();
        List<AccountDto> result = new ArrayList<>();

        for (Account account: accounts) {
            AccountDto dto = new AccountDto();
            dto.setClientId(account.getClientId());
            dto.setNumber(account.getNumber());
            dto.setValue(account.getValue());
            result.add(dto);
        }

        return result;
    }
}
