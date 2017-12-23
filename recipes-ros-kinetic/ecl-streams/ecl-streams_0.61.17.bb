# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "These are lightweight text streaming classes that connect to standardised      e"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-concepts ecl-converters ecl-devices ecl-errors ecl-license ecl-time ecl-type-traits"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/kinetic/ecl_streams/0.61.17-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "380bc77df3739ca1688fd2d4e72e5c46"
SRC_URI[sha256sum] = "43fc6dfe2972b2a6ab5bea838ea07972f23ba86fe19d1df669bab7ae7a98355e"
S = "${WORKDIR}/ecl_core-release-release-kinetic-ecl_streams-0.61.17-0"

inherit catkin
