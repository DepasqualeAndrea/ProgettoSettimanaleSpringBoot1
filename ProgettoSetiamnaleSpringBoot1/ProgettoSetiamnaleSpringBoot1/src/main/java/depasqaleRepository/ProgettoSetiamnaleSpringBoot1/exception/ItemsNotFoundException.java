package depasqaleRepository.ProgettoSetiamnaleSpringBoot1.exception;

public class ItemsNotFoundException extends RuntimeException {

	public ItemsNotFoundException(int id) {
		super("item with id" + id + "not found");
	}

}
