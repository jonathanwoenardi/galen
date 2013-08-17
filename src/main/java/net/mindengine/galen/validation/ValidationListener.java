package net.mindengine.galen.validation;

import net.mindengine.galen.specs.Spec;

public interface ValidationListener {
    
    void onObject(PageValidation pageValidation, String objectName);
    
    void onSpecError(PageValidation pageValidation, String objectName, Spec spec, ValidationError error);

    void onSpecSuccess(PageValidation pageValidation, String objectName, Spec spec);

    

}