package io.gd.generator.meta.jpa;

import io.gd.generator.api.query.Predicate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JpaQueryModelMeta {

    private boolean useLombok;

    private String queryModelPackage;

    private String entityType;

    private String entityName;

    private String type;

    private Set<String> fieldNames = new HashSet<>();

    private List<QueryModelField> queryModelFields = new ArrayList<>();

    /**
     * import全名
     */
    private Set<String> importFullTypes = new HashSet<>();

    public Set<String> getFieldNames() {
        return fieldNames;
    }

    public void setFieldNames(Set<String> fieldNames) {
        this.fieldNames = fieldNames;
    }

    public boolean isUseLombok() {
        return useLombok;
    }

    public void setUseLombok(boolean useLombok) {
        this.useLombok = useLombok;
    }

    public Set<String> getImportFullTypes() {
        return importFullTypes;
    }

    public void setImportFullTypes(Set<String> importFullTypes) {
        this.importFullTypes = importFullTypes;
    }

    public List<QueryModelField> getQueryModelFields() {
        return queryModelFields;
    }

    public void setQueryModelFields(List<QueryModelField> queryModelFields) {
        this.queryModelFields = queryModelFields;
    }

    public String getQueryModelPackage() {
        return queryModelPackage;
    }

    public void setQueryModelPackage(String queryModelPackage) {
        this.queryModelPackage = queryModelPackage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEntityType() {
        return entityType;
    }

    public String getEntityName() {
        return entityName;
    }

    public JpaQueryModelMeta setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }

    public JpaQueryModelMeta setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    public static class QueryModelField {

        private Predicate predicate;

        private String fieldName;

        private String name;

        private String type;

        private boolean array;

        public boolean isArray() {
            return array;
        }

        public void setArray(boolean array) {
            this.array = array;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Predicate getPredicate() {
            return predicate;
        }

        public QueryModelField setPredicate(Predicate predicate) {
            this.predicate = predicate;
            return this;
        }

        public String getFieldName() {
            return fieldName;
        }

        public QueryModelField setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
    }

}
