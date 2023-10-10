<template>
    <div>
        <String label="이름" v-model="value.name" :editMode="editMode"/>
        <Number label="크기" v-model="value.size" :editMode="editMode"/>
        <Photo offline label="Photo" v-model="value.photo" :editMode="editMode" @change="change"/>
        <Money offline label="Price" v-model="value.price" :editMode="editMode" @change="change"/>

        <v-divider class="border-opacity-100 my-divider"></v-divider>
        <v-layout row justify-end>
            <v-btn
                width="64px"
                color="primary"
                @click="save"
            >
                저장
            </v-btn>
        </v-layout>
    </div>
</template>


<script>

import BaseEntity from './base-ui/BaseEntity'

export default {
    name: 'Product',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "products"
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>

