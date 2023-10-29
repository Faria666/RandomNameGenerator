import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.randomnamegenerator.generator.RepositoryGenerator
import com.example.randomnamegenerator.generator.RepositoryGeneratorInterface
import com.example.randomnamegenerator.generator.models.Baby
import com.example.randomnamegenerator.generator.models.Name
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.random.Random

class ViewModelGenerator(application: Application) : AndroidViewModel(application) {

    private val babyRepository: RepositoryGeneratorInterface = RepositoryGenerator()
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO
    private val data = MutableLiveData<List<Baby>>()
    private var maleData = mutableMapOf<String, Name>()
    private var femaleData = mutableMapOf<String, Name>()
    private var femaleCount = 0
    private var maleCount = 0
    private val displayName = MutableLiveData<String>()

    fun getData() {
        viewModelScope.launch(dispatcher) {
            val result = babyRepository.fetchJson()

            result.onSuccess { babiesResult ->
                data.postValue(babiesResult)

                for (baby in babiesResult) {
                    val name = baby.name.toLowerCase() // Converter o nome para minúsculas
                    val gender = baby.gender.toLowerCase() // Converter o genero para minúsculas
                    val occur = baby.count

                    if(gender == "male"){
                        maleCount+=baby.count
                        if (name in maleData) {
                            val ncMap = maleData[name]?: break
                            maleData[name] = Name(ncMap.name, ncMap.gender, ncMap.count + occur)
                        }
                        else {
                            maleData[name] = Name(name, gender, occur)
                        }
                    } else if(gender == "female"){
                        femaleCount+=baby.count
                        if (name in femaleData) {
                            val ncMap = femaleData[name]?: break
                            femaleData[name] = Name(ncMap.name, ncMap.gender, ncMap.count + occur)
                        }
                        else {
                            femaleData[name] = Name(name, gender, occur)
                        }
                    }
                }

                val mapMSize = maleData.size
                val mapFSize = femaleData.size
                Log.d("MALE", "" + maleCount)
                Log.d("FEMALE", "" + femaleCount)

            }.onFailure {
                data.postValue(emptyList())
            }
        }
    }

    fun getMaleName(): LiveData<String> {
        val random = Random

        val randomNumber = random.nextInt(maleCount)
        Log.d("RANDOM MALE", ""+randomNumber)
        var count = 0
        for (name in maleData){
            count += name.value.count
            if (randomNumber <= count){
                displayName.postValue(name.value.name)
                break
            }
        }

        return displayName
    }

    fun getFemaleName(): LiveData<String> {
        val random = Random

        val randomNumber = random.nextInt(femaleCount)
        Log.d("RANDOM FEMALE", ""+randomNumber)

        var count = 0
        for (name in femaleData){
            count += name.value.count
            if (randomNumber <= count){
                displayName.postValue(name.value.name)
                break
            }
        }

        return displayName
    }
}
