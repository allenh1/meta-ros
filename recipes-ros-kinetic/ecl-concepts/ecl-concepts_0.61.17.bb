# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Introduces a compile time concept checking mechanism that can be used      most "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-config ecl-license ecl-type-traits"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/kinetic/ecl_concepts/0.61.17-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "feb18b0c739949cea619817a4ba80e39"
SRC_URI[sha256sum] = "6ac09d0f74f47b68d140e00d026e55d1867ea30d9af74a5528a776002d9c122d"
S = "${WORKDIR}/ecl_core-release-release-kinetic-ecl_concepts-0.61.17-0"

inherit catkin
