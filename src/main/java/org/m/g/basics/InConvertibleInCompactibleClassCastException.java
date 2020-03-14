package org.m.g.basics;

public class InConvertibleInCompactibleClassCastException {

    public static void main(String[] args) {

        DDrive ddrive = new Movies();
        Root ddriveRoot = ddrive;

        // Type mismatch: cannot convert from DDrive to CDrive
        // in convertible types i.e. we cannot assign the DDrive type variable to CDDrive type.
		// CDrive cdrive = ddrive; //compilation error:

        // error:Cannot cast from DDrive to CDrive
        // we cannot type cast the DDrive type to CDrive type as they are not compatible.
		// CDrive cdrive = (CDrive)ddrive; //compilation

        // Inheritance Example
        // Exception in thread "main" java.lang.ClassCastException
        Root ddsriveRoot = (Songs) ddrive;


        // simple Example
        String stringValue = "Hello";
        Object objValue = stringValue;
        Integer integerValue = (Integer)objValue;

    }

}


class Root {
}

class CDrive extends Root {
}

class DDrive extends Root {
}

class ProgramFiles extends CDrive {
}

class ProgramData extends CDrive {
}

class Movies extends DDrive {
}

class Songs extends DDrive {
}