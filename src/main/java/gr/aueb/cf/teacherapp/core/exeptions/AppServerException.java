package gr.aueb.cf.teacherapp.core.exeptions;

public class AppServerException extends EntityGenericException {

    public AppServerException(String code, String message) {
        super(code, message);
    }
}
