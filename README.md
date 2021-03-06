##### sdw-kotlin

# Santander Dev Week - Kotlin

### Projeto: Replicar tela Home do App Santander

#### Desafio
- Aprender sobre o ecossistema Android.
- Criar Layouts fantásticos.
- Padrões de Arquitetura Android.
- Replicar tela Home do Santander.

#### Percurso
1. Aula: Preparação do ambiente e criação do nosso primeiro App.
2. Aula: Layouts e diretrizes de design.
3. Aula: Padrões arquiteturais e boas práticas de desenvolvimento.
4. Aula: Monitoramento e publicação de Apps.

#### Requisitos
- Conceitos de O.O. (Orientação à Objetos).
- Comunidade online DIO (Discord).

## Aula 1: Ambiente e Primeiro App - Santander Kotlin Dev Week.

#### Ambiente:
1. Instalação do Android Studio.
2. Android SDK.
3. Android Virtual Device (AVD).

#### Primeiro App:
1. Criar projeto para phone e tablet, com empty activity.
    ```
    Name: SantanderDevWeek
    Package name: com.example.santanderdevweek
    Language: Kotlin
    ```
2. Pasta app / manifest / AndroidManifest.xml
    - icone do app
    - nome do app
    - tela principal (MainActivity)
    - recursos da aplicação
    - permissões do app

3. Pasta app / java / com.example.santanderdevweek / MainActivity.kt
    - primeira tela gerada automaticamente.
    - referencia o primeiro aquivo de layout (activity_main.xml).
    - as outras duas pastas dento da pasta java ...(androidTest) e ...(test), são relativas a testes.
    - ESTUDAR SOBRE TESTES...

4. Pasta app / res (Resources)
    - drawable: icones, desenhaveis
    - layout: activity_main.mxl
    - mipmap: icones, icones launchers
    - values: colors.xml (tema da app), strings.xml (textos), themes (temas da app).

5. Gradle Scripts:
    - arquivos de configuração da build.
    - versão da linguagem.
    - diretorios
    - dependencias

6. Estudar mais sobre variaveis, condicionais, funções e classes em Kotlin

7. Mudar o ícone do app
    - pasta res
    - baixar o arquivo novo do site:
        https://fonts.google.com/icons
    - importar como new / image asset

8. Layout da home da app do Santander "figma"
    - cores:

        app/res/values/colors.xml

        ```xml
        <color name="redPrimary">#cd0001</color>
        <color name="redSecundary">#9d0808</color>
        ```

    - themes:

        app/res/values/themes.xml

        ```xml
        <item name="colorPrimary">@color/redPrimary</item>
        <item name="colorPrimaryVariant">@color/redSecundary</item>
        ```

        Mudar:

        ```xml
        <style name="Theme.SantanderDevWeek" parent="Theme.MaterialComponents.DayNight.DarkActionBar">
        ```

        Para:

        ```xml
        <style name="Theme.SantanderDevWeek" parent="Theme.MaterialComponents.DayNight.NoActionBar">
        ```

    - activity_main:
        app/src/main/res/layout/activity_main.xml

        ```xml
        <androidx.appcompat.widget.Toolbar
        android:id="@+id/toolbar"
        android:layout_width="409dp"
        android:layout_height="wrap_content"
        android:background="?attr/colorPrimary"
        android:minHeight="?attr/actionBarSize"
        android:theme="?attr/actionBarTheme"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
        ```

        Essa toolbar foi adicionada pelo modo designer grudando no topo/dir/esq

## Aula 2: Boas práticas para diretrizes de design e layouts no Android - Santander Kotlin Dev Week

### Objetivos

- Principais layouts para criação de telas
  - LinearLayout;
  - Constraint Layout;
- Explorando a paleta de componentes
- Menus
- Material Design
- Evoluindo a tela inicial do App

## Aula 3: Padrões arquiteturais e boas práticas de desenvolvimento

- Padrões Arquiteturais MVC / MVVM
  - MVC - Separa o APP em 3 níveis de responsabilidade
  - Model - é a lógica ou o core do nosso negócio
  - View - Exibe as visualizações do nosso App
  - Controller - Controle do View e Model
  - Ex:
    - View: my_view.xml
    - Controller: MyActivity.kt
    - Model: Person.kt / Car.kt
  - Prós: Separa modelos e camadas
  - Contras: Forte acoplamento regras de negócios e ligação com a view
- Organização do App com MVVM
  - MVVM é um padrão derivativo do MVP Pattern
  - Ajuda separar a camada lógica de UI e vice-versa
  - Facilita a testabilidade
  - Maior resiliência em app's Android
- Internacionalização (i18n)

## Aula 4: Monitoramento e publicação de apps Android

- Firebase
  - Plataforma de monitoração
  - Conjunto de ferramentas
  - Ajuda a identificar crashes do app (Analytics)
  - Auxilia na distribuição de apps
- Monitoração de performance
  - Plataforma de monitoramento de performance de recursos do seu aparelho
  - Recebe insights sobre caracteristicas de desempenho de apps
  - Ajuda a entendende onde o desempenho precisa ser melhorado
  - Crashlytics
    - Ferramenta de relatório de falhas
    - Ajuda identificar bugs e manter a resiliência do app
    - Acompanhamento da saúde de versões do app
    - Possivel visualizar que tipo de device esta sendo atingido
  - Analytics
    - Nucleo do firebase
    - Insights sobre uso do app e envolvimento de usuarios
    - Gera relatorios dos diversos tipos de analises
  - App Distribution
    - Facilita a distribuição do app
    - Auxilia o piloto do app
    - Possibilita disponibilizar para usuários chaves antes de ir para a PlayStore
  - Test Lab
    - Infraestrutura de testes de apps na nuvem
    - Testa o app em uma gama elevada de dispositivos
    - Possibilita realizar testes de robo e testes instrumentados

- Publicação
  - Como gerar uma APK/Bundle assinada
  - A importância da key Store
  - Google Play Console
