package gr.aueb.cf.teacherapp.core.exeptions;

public class EntityAlreadyExistsException extends EntityGenericException {

    private static final String DEFAULT_CODE = "AlreadyExists";

    public EntityAlreadyExistsException(String code, String message) {
        super(code + DEFAULT_CODE, message);
    }
}