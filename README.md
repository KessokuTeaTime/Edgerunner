### <p align=right>[`→` Modrinth](https://modrinth.com/mod/edgerunner-feature-fix)</p>

# Edgerunner

**Edgerunner** brings back the feature of
*receiving effects according to the block right below the player's feet instead of the actual block the player is standing on,*
which was reported in [`MC-1133`](https://bugs.mojang.com/browse/MC-1133)
and fixed in [`23w18a`](https://feedback.minecraft.net/hc/en-us/articles/15447880761997-Minecraft-Java-Edition-23w18a).

Basically, in `23w18a` and above,
you can't eliminate the effects provided by *soul sand, magma blocks, slime blocks,
honey blocks, ice, etc.* by standing on the edge of the blocks anymore.

It was indeed a bug which has lasted *for over 10 years,*
but it was also a feature interesting enough that many players don't want it to be fixed nor removed.

**So, here it is again.**

## Usage

**Edgerunner** has implemented the feature as a gamerule,
which can be configured easily by in-game commands.

To **enable** the feature, run:
```
/gamerule edgerunner true
```
And to **disable** it, run:
```
/gamerule edgerunner false
```

## License

**Edgerunner** is licensed under the **[GNU General Public License v3.](LICENSE)**
