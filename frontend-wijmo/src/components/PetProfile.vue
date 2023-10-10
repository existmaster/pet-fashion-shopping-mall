<template>
    <div>
        <String label="이름" v-model="value.name" :editMode="editMode"/>
        <String label="종류" v-model="value.species" :editMode="editMode"/>
        <Number label="나이" v-model="value.age" :editMode="editMode"/>
        <Photo offline label="사진" v-model="value.photo" :editMode="editMode" @change="change"/>

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
    name: 'PetProfile',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "petProfiles"
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>

