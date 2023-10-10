<template>
    <div>
        <String label="이름" v-model="value.name" :editMode="editMode"/>
        <Number label="무게" v-model="value.weight" :editMode="editMode"/>
        <Number label="목둘레" v-model="value.neckCircumference" :editMode="editMode"/>
        <Number label="가슴둘레" v-model="value.chestCircumference" :editMode="editMode"/>
        <Number label="나이" v-model="value.age" :editMode="editMode"/>
        <Number label="MemberId" v-model="value.memberId" :editMode="editMode"/>
        <Breed offline label="품종" v-model="value.breed" :editMode="editMode" @change="change"/>
        <Allergies offline label="알러지" v-model="value.allergies" :editMode="editMode" @change="change"/>

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

