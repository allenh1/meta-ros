# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This packages provides a configurable driver of a chain   of Schunk powercubes. "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-srvs control-msgs diagnostic-msgs libntcan libpcan linux-headers-generic roscpp schunk-libm5api sensor-msgs std-msgs std-srvs trajectory-msgs urdf"
SRC_URI = "https://github.com/ipa320/schunk_modular_robotics-release/archive/release/kinetic/schunk_powercube_chain/0.6.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8eec4a3ceba8dbe60410229a101da127"
SRC_URI[sha256sum] = "b1ecd5dfd842a459a454e631544ed39756b4ae9be02ddcd3301a085b3398c2c0"
S = "${WORKDIR}/schunk_modular_robotics-release-release-kinetic-schunk_powercube_chain-0.6.9-0"

inherit catkin
