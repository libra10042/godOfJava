package ch21.object_compare_generic.problem;

public class GenericSample {

    public static void main(String[] args) {
        GenericSample sample = new GenericSample();
        sample.checkCastingDTO();

        sample.checkDTO(sample.checkCastingDTO());
    }

    public ch21.object_compare_generic.problem.CastingDTO checkCastingDTO(){
        ch21.object_compare_generic.problem.CastingDTO dto1 = new ch21.object_compare_generic.problem.CastingDTO();
        dto1.setObject(new String());

        ch21.object_compare_generic.problem.CastingDTO dto2 = new ch21.object_compare_generic.problem.CastingDTO();
        dto2.setObject(new StringBuffer());

        ch21.object_compare_generic.problem.CastingDTO dto3 = new ch21.object_compare_generic.problem.CastingDTO();
        dto3.setObject(new StringBuilder());

        String temp1 = (String) dto1.getObject();
        StringBuffer temp2 = (StringBuffer) dto2.getObject();
        StringBuilder temp3 = (StringBuilder) dto3.getObject();
        return dto2;
    }

    public void checkDTO(ch21.object_compare_generic.problem.CastingDTO dto){
        Object tempObject = dto.getObject();
        if(tempObject instanceof StringBuilder){
            System.out.println("StringBuilder");
        }else if(tempObject instanceof StringBuffer){
            System.out.println("StringBuffer");
        }else {
            System.out.println("String");
        }
    }
}
