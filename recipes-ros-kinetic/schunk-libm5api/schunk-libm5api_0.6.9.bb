# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package wraps the libm5api to use it as a ros dependency. Original sources "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native libntcan libpcan"
SRC_URI = "https://github.com/ipa320/schunk_modular_robotics-release/archive/release/kinetic/schunk_libm5api/0.6.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "04ff6adb6b1ed12a60a9d06eb05c9ae1"
SRC_URI[sha256sum] = "b5e7cd214218345e519904c2c5647f5f8f5b3ccc9361f40fc827028aebbcaffd"
S = "${WORKDIR}/schunk_modular_robotics-release-release-kinetic-schunk_libm5api-0.6.9-0"

inherit catkin
