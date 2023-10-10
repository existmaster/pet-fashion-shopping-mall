<template>

    <v-card outlined>
        <v-card-title>
            UpdateProduct
        </v-card-title>

        <v-card-text>
            <String label="Id" v-model="value.id" :editMode="editMode"/>
            <String label="Name" v-model="value.name" :editMode="editMode"/>
            <File offline label="Photo" v-model="value.photo" :editMode="editMode" @change="change"/>
            <Money offline label="Price" v-model="value.price" :editMode="editMode" @change="change"/>
            <Size offline label="Size" v-model="value.size" :editMode="editMode" @change="change"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="updateProduct"
            >
                UpdateProduct
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'UpdateProductCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.id = '';
            this.value.name = '';
            this.value.photo = {};
            this.value.price = {};
            this.value.size = {};
        },
        watch: {
        },
        methods: {
            updateProduct() {
                this.$emit('updateProduct', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

