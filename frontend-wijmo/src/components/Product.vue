<template>
    <div>
        <String label="이름" v-model="value.name" :editMode="editMode"/>
        <File offline label="사진" v-model="value.photo" :editMode="editMode" @change="change"/>
        <Money offline label="가격" v-model="value.price" :editMode="editMode" @change="change"/>
        <Size offline label="사이즈" v-model="value.size" :editMode="editMode" @change="change"/>

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

