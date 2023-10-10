<template>
    <div>
        <String label="비밀번호" v-model="value.password" :editMode="editMode"/>
        <String label="Email" v-model="value.email" :editMode="editMode"/>

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
    name: 'Member',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "members"
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>

