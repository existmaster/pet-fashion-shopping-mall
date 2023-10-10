<template>

    <v-card outlined>
        <v-card-title>
            PetInformation # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <String label="MemberId" v-model="item.memberId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="NeckCircumference" v-model="item.neckCircumference" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="ChestCircumference" v-model="item.chestCircumference" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'PetInformationViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/petInformations/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

