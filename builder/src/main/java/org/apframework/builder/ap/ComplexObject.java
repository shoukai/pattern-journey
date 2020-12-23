package org.apframework.builder.ap;

public class ComplexObject {

    private String text;
    private Integer value;
    private Integer size;

    private ComplexObject(ComplexObjectBuilder builder) {
        this.setSize(builder.size);
        this.setText(builder.text);
        this.setValue(builder.value);
    }

    @Override
    public String toString() {
        return "ComplexObject{" +
                "text='" + text + '\'' +
                ", value=" + value +
                ", size=" + size +
                '}';
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public static class ComplexObjectBuilder {
        private String text;
        private Integer value;
        private Integer size;

        public ComplexObjectBuilder withText(String text) {
            this.text = text;
            return this;
        }

        public ComplexObjectBuilder withValue(Integer value) {
            this.value = value;
            return this;
        }

        public ComplexObjectBuilder withSize(Integer size) {
            this.size = size;
            return this;
        }

        public ComplexObject build() {
            return new ComplexObject(this);
        }
    }

    public static void main(String[] args) {
        ComplexObjectBuilder builder = new ComplexObjectBuilder();
        System.out.println(builder.withSize(100).withText("this is text").withValue(1).build());
    }

}
