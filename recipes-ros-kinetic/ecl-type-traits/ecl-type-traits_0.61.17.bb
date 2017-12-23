# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Extends c++ type traits and implements a few more to boot."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-config ecl-license ecl-mpl"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/kinetic/ecl_type_traits/0.61.17-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "79bc6a67af10cc16f87c2f6297a4ed78"
SRC_URI[sha256sum] = "1d0065ebc2d093020959ca0695a7b671b68f3b15ab8757212bb312d0db35c568"
S = "${WORKDIR}/ecl_core-release-release-kinetic-ecl_type_traits-0.61.17-0"

inherit catkin
