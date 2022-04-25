package Bank_Project;

@SuppressWarnings("serial")
class CustomExecption extends Exception {
	public CustomExecption(String message)
	{
		super(message);
	}
}
     @SuppressWarnings("serial")
	 class AccountExistException extends CustomExecption{

		public AccountExistException(String message)
		{
			super(message);
		}
	}

	@SuppressWarnings("serial")
	class AccountNotFoundException extends CustomExecption {

		public AccountNotFoundException(String message)
		{
			super(message);
		}
	}
	@SuppressWarnings("serial")
	class InsufficientBalanceException extends CustomExecption{

		public InsufficientBalanceException(String message)
		{
			
			super(message);
		}
	}
	@SuppressWarnings("serial")
	 class MinimumBalanceException extends CustomExecption{

		public MinimumBalanceException(String message)
		{
			super(message);
		}
	}
