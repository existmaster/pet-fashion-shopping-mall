<template>
    <div>
        <String label="알러지" v-model="value.allergy" :editMode="editMode"/>
        <String label="사이즈 정보" v-model="value.sizeInfo" :editMode="editMode"/>
        <Number label="PetId" v-model="value.petId" :editMode="editMode"/>

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
    name: 'AllergySizeInfo',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "allergySizeInfos"
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>

