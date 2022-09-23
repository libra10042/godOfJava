package ch21.object_compare_generic.solution;

public class GenericSample {
    public static void main(String[] args) {
        GenericSample sample = new GenericSample();
        sample.checkGenericDTO();


    }
    public CastingGenericDTO checkGenericDTO(){
        CastingGenericDTO<String> dto1 = new CastingGenericDTO<String>();
        dto1.setObject(new String());
        CastingGenericDTO<StringBuilder> dto2 = new CastingGenericDTO<StringBuilder>();
        dto2.setObject(new StringBuilder());
        CastingGenericDTO<StringBuffer> dto3 = new CastingGenericDTO<StringBuffer>();
        dto3.setObject(new StringBuffer());

        String temp1 = dto1.getObject();
        StringBuilder temp3 = dto2.getObject();
        StringBuffer temp2 = dto3.getObject();

        return dto1;
    }
}
